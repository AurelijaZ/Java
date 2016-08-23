package addressBook;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by student on 23-Aug-16.
 */
public class CommandGUI {
    //creating this class only for the purpose of accepting users input!

    static Scanner input = new Scanner(System.in);

    static void display() {
        int choice;
        do {
            System.out.println("Welcome to Address Book");
            System.out.println("1. Add a Contact");
            System.out.println("2. Edit a Contact");
            System.out.println("4. List all Contacts");
            System.out.println("5. Search by the First Name");
            System.out.println("6. Terminate");
            System.out.println();
            System.out.println("Enter between (1-6): ");

            //read input
            choice = input.nextInt();
        } while (choice < 1 || choice > 6);

        List<String> tempData = new ArrayList<>();

        switch (choice) {
            case 1:
                tempData = inputScreen();
                addressBook.TaskProcessing.createContact(tempData);
                display();
            case 2:
            case 3:
            case 4:
           //     addressBook.TaskProcessing.printAll();
                display();
            case 5:
            case 6:
                break;

        }
    }

    static List<String> inputScreen() {
        List<String> contactData = new ArrayList<>(); //this scope of employee doesn't go anywhere else!

        input.nextLine();
        System.out.print("Please Enter your D.O.B (YYYY/MM/DD):");
        String dob = input.nextLine();
        String[] dobData = dob.split("/"); //use split for an array

        for (int i = 0; i <= dobData.length - 1; i++) {
            contactData.add(dobData[i]);
        }
        System.out.print("Please Enter First Name:");
        contactData.add(input.nextLine()); //when user input data, it gets stored.

        System.out.print("Please Enter Last Name;");
        contactData.add(input.nextLine());

        System.out.print("Please Enter First Line Address:");
        contactData.add(input.nextLine());

        System.out.print("Please Enter Postcode:");
        contactData.add(input.nextLine());

        System.out.print("Please Enter your Email");
        contactData.add(input.nextLine());

        System.out.print("Please Enter your Facebook Name:");
        contactData.add(input.nextLine());

        System.out.print("Please Enter Phone Number:");
        contactData.add(input.nextLine());

        System.out.print("Please Enter your Twitter:");
        contactData.add(input.nextLine());

        return contactData;
    }

}


