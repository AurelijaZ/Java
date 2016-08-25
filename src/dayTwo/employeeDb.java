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

    public List<String> queryAll () throws Exception {

        statement = con.createStatement();
        rs = statement.executeQuery("Select * from employee");
        int columnCount = metaData.getColumnCount();

        while (rs.next()) {
            for (int i =1; i <= columnCount; i++) {
                data.add(rs.getString(i));

            }
            TaskProcessing.printAll(data);
        }
    }



}
