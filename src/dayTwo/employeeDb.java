package dayTwo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 25-Aug-16.
 */


public class employeeDb {

        List<Employee> employess = new ArrayList();
        List<String> data = new ArrayList<>();
        static Connection con;
        static Statement statement = null;
        static ResultSet rs = null;
        static ResultSetMetaData metaData;
        static int rowCount = 0;

    String userName = "root";
    String password = "Password100";
    String url = "jdbc:mysql://localhost:3306/augustDpp?UseSSL=false"; //connection to this machine

    public employeeDb() throws Exception {
        //load driver
        Class.forName("com.mysql.jdbc.Driver");
        //connect to augustDpp
        con = DriverManager.getConnection(url, userName, password);

    }

    public void queryAll () throws SQLException {

        statement = con.createStatement();
        rs = statement.executeQuery("Select * from employee");
        metaData = rs.getMetaData(); //please retreat information
        int columnCount = metaData.getColumnCount();

        while (rs.next()) {
            for (int i =2; i <= columnCount; i++) {
                data.add(rs.getString(i));

            } //this will retreat information from database and showcase in generatePeople
            TaskProcessing.createEmployee(data);
            data.clear();
            rowCount++; //need to know how many rows we have counted so far
        }
    }
    public  void addEmployee(List<String> data) throws SQLException {
        PreparedStatement statement = con.prepareStatement("Insert into Employee (firstname," + "lastname, height," +
                                         "weight, birthdate, sextype, position, hiredate) VALUES (?,?,?,?,?,?,?,?)");

        statement.setString(1,data.get(0));
        statement.setString(2, data.get(1));
        statement.setInt(3, Integer.parseInt(data.get(2)));
        statement.setDouble(4, Double.parseDouble(data.get(3)));
        statement.setDate(5, Date.valueOf(data.get(4)));
        statement.setString(6, data.get(5));
        statement.setString(7, data.get(6));
        statement.setDate(8, Date.valueOf(data.get(7)));

        statement.executeUpdate();
        statement.close();
    }



}
