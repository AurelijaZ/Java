package ComputerShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ComputerShop.GeneratingComputer.computer;
import static ComputerShop.TaskProcessing.BY_PRICE;
import static ComputerShop.TaskProcessing.searchByName;

/**
 * Created by student on 26-Aug-16.
 */
public class Command {

    static Scanner input = new Scanner(System.in);

    static void display() {
        int choice;
        do {
            //call display and then show the options
            System.out.println("Welcome to the Computer Shop");
            System.out.println("1. Create new Computer");
            System.out.println("2. Create new Customer");
            System.out.println("3. Search");
            System.out.println("4. Match");
            System.out.println("5. Sort Computers");
            System.out.println("6. List all the Computers");
            System.out.println("7. Quit ");
            System.out.println();
            System.out.println("Enter a number you wish to proceed with: ");

            //read input
            choice = input.nextInt(); //encapsulation

        } while (choice < 1 || choice > 7);
        int index;
        List<String> computerData = new ArrayList<>(); //temp data is there to just collect the information given

//once we have the input, we then run the options
        switch (choice) {
            case 1:
                computerData = inputScreen2(); //give the user input (input screen)
                TaskProcessing.createComputer(computerData);
                display();
                break;
           /* case 2:
                customerData = inputScreen(), inputScreen2(); //give the user input (input screen)
                TaskProcessing.createCustomer(customerData);
                display();
                break; */
            case 3:
                index = findComputer();
                System.out.println(computer.get(index));
                display();
                break;
            case 4:

                break;
            case 5:
              //  TaskProcessing.printAll();
                computer.sort(BY_PRICE);
                TaskProcessing.printAll();
                display();
                break;
            case 6:
                break;
            case 7:
                break;

        }
    }

    static List<String> inputScreen() { //it only collects the input set out by the user.
        List<String> customerData = new ArrayList<>(); //this scope of computer data doesn't go anywhere else!

        input.nextLine();
        System.out.print("Please Enter First Name: ");
        customerData.add(input.nextLine()); //when user input data, it gets stored.

        System.out.print("Please Enter your Last Name: ");
        customerData.add(input.nextLine());

        System.out.print("Please Enter your Customer ID: ");
        customerData.add(input.nextLine());

        System.out.print("Please Enter your Address: ");
        customerData.add(input.nextLine());

        System.out.print("Please Enter Phone Number: ");
        customerData.add(input.nextLine());

        System.out.print("Please Enter Credit Cards Details: ");
        customerData.add(input.nextLine());


        return customerData;


    }

    static List<String> inputScreen2() { //it only collects the input set out by the user.
        List<String> computerData = new ArrayList<>();
        input.nextLine();
        System.out.print("Please Enter Model Type: ");
        computerData.add(input.nextLine()); //when user input data, it gets stored.

        System.out.print("Please Enter CPU Type: ");
        computerData.add(input.nextLine());

        System.out.print("Please Enter CPU Speed: ");
        computerData.add(input.nextLine());

        System.out.print("Please Enter Hard Drive: ");
        computerData.add(input.nextLine());

        System.out.print("Please Enter Graphics Spec: ");
        computerData.add(input.nextLine());

        System.out.print("Please Enter Battery Life: ");
        computerData.add(input.nextLine());

        System.out.print("Please Enter RAM: ");
        computerData.add(input.nextLine());

        System.out.print("Please Enter the Price: ");
        computerData.add(input.nextLine());


        return computerData;
    }

    static int findComputer() {
        System.out.print("Enter Computer Name:"); //only ask the user to put the first name
        String brandModel = input.next();

        return TaskProcessing.searchByName(brandModel);
    }
}

