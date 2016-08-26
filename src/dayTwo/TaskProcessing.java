package dayTwo;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import static dayTwo.generatingPeople.people;

/**
 * Created by student on 23-Aug-16.
 */

//the whole logic of every class!
public class TaskProcessing {

    static employeeDb db;

    static  void prepareDb() throws Exception {
        db = new employeeDb();
        db.queryAll();
    }

    static  void loadData() throws SQLException {
        people.clear();
        db.queryAll(); //reload the data once its been updated

    }

    static void newEmployee (List<String> data) throws SQLException {
        db.addEmployee(data);
        loadData();

    }
    static void createEmployee(List<String> data) {

        String[] dob = data.get(4).split("-");
        String[] hireDate = data.get(7).split("-");
        //creating new object - then use the list to bring all information from other classes onto bellow information.
        Employee temp = new Employee(
                data.get(0),
                data.get(1),
                Short.parseShort(data.get(2)),
                Double.parseDouble(data.get(3)),

                LocalDate.of(Integer.parseInt(dob[0]),Integer.parseInt(dob[1]),
                Integer.parseInt(dob[2])),
                checkSex(data.get(5)),
                data.get(6),
                LocalDate.of(
                        Integer.parseInt(hireDate[0]),
                        Integer.parseInt(hireDate[1]),
                        Integer.parseInt(hireDate[2])));


        people.add(temp); //add new employee to our person collection
    }

    public static void printAll() { //prints all objects
        for (Person e : people) //for each person, e represents one person
            //when we call E , we call the to String function from employee class.
            System.out.println(String.format("[%s] " + e, people.indexOf(e) ));
    }

static int searchByFirstName(String firstName) { //accept the string method
    for (Person p : people)
        if (p.getFirstName().contains(firstName)) //if the firstName is the same then print out the index!
            return people.indexOf(p);

    return -1; //if it did not find the index then you return -1
}

    //editing
    static void editDetail(int index, List<String> data) {
        people.get(index).setFirstName(data.get(0));
        people.get(index).setLastName(data.get(1));
        people.get(index).setHeight(Short.parseShort(data.get(2)));
        people.get(index).setWeight((Double.parseDouble(data.get(3))));
        people.get(index).setBirthDate(LocalDate.of(
                Integer.parseInt(data.get(4)),
                Integer.parseInt(data.get(5)),
                Integer.parseInt(data.get(6))));
        people.get(index).setSex(checkSex(data.get(7)));
        people.get(index).setHireDate(LocalDate.of(
                Integer.parseInt(data.get(8)),
                Integer.parseInt(data.get(9)),
                Integer.parseInt(data.get(10))));
                people.get(index).setPosition(data.get(11));
    }
    static SexType checkSex(String data) {
        if (data.contains("M")) {
            return SexType.MALE;
        } else {
            return SexType.FEMALE;

        }
    }
        static void removeEmployee(int index) {
        people.remove(index);
    }
    }

