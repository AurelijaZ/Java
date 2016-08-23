package dayTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static dayTwo.generatingPeople.people;
/**
 * Created by student on 23-Aug-16.
 */
public class commandGUI {

    //creating this class only for the purpose of accepting users input!

    static Scanner input = new Scanner(System.in);

    static void display() {
        int choice;
        do {
            System.out.println("Welcome to Employee Database");
            System.out.println("1. Add an Employee");
            System.out.println("2. Edit an Employee");
            System.out.println("3. Remove an Employee");
            System.out.println("4. List all Employees");
            System.out.println("5. Search by the First Name");
            System.out.println("6. Terminate");
            System.out.println();
            System.out.println("Enter between (1-6): ");

            //read input
            choice = input.nextInt();
        } while (choice < 1 || choice > 6);
        int index;
        List<String> tempData = new ArrayList<>();

        switch (choice) {
            case 1:
                tempData = inputScreen();
                TaskProcessing.createEmployee(tempData);
                display();
            case 2:
                index = findFirstName();
                tempData = inputScreen();
                TaskProcessing.editDetail(index, tempData);
            case 3:
                TaskProcessing.removeEmployee(requestIndex());
                display();
            case 4:
                TaskProcessing.printAll();
                display();
            case 5:
                index = findFirstName();
                System.out.println(people.get(index));
                display();
            case 6:
                break;

        }
    }

    static List<String> inputScreen() {
        List<String> employeeData = new ArrayList<>(); //this scope of employee doesn't go anywhere else!

        input.nextLine();
        System.out.print("Please Enter First Name:");
        employeeData.add(input.nextLine()); //when user input data, it gets stored.

        System.out.print("Please Enter Last Name;");
        employeeData.add(input.nextLine());

        System.out.print("Please Enter your Height:");
        employeeData.add(input.nextLine());

        System.out.print("Please Enter Weight:");
        employeeData.add(input.nextLine());

        System.out.print("Please Enter D.O.B (YYYY/MM/DD): ");
        String dob = input.nextLine();
        String[] dobData = dob.split("/"); //use split for an array

        for (int i = 0; i <= dobData.length - 1; i++) {
            employeeData.add(dobData[i]);
        }
        System.out.print("Please Enter Your Sex M/F:");
        employeeData.add(input.nextLine());


        System.out.print("Please Enter your Hire Date (YYYY/MM/DD):");
        String hireData = input.nextLine();
        String[] hireDate = hireData.split("/"); //use split for an array

        for (int i = 0; i <= hireDate.length - 1; i++) {
            employeeData.add(hireDate[i]);
        }

        System.out.print("Please Enter your Job Position:");
        employeeData.add(input.nextLine());


        return employeeData;
    }

    static int findFirstName() {
        System.out.print("Enter first Name:");
        String firstName = input.next();
        return TaskProcessing.searchByFirstName(firstName);
    }
    static int requestIndex() {
        System.out.print("Enter Employee index to remove: ");
        return input.nextInt();
    }
}
