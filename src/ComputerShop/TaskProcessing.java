package ComputerShop;

import java.util.Comparator;
import java.util.List;


import static ComputerShop.GeneratingComputer.computer;

/**
 * Created by student on 26-Aug-16.
 */
public class TaskProcessing {

    static Comparator<Computer> BY_PRICE = new Comparator<Computer>() {
        @Override
        public int compare(Computer c1, Computer c2) {
            return Double.compare(c1.getPrice(), c2.getPrice());
        }
    };

    static void createComputer(List<String> computerData) {

        Computer released = new Computer(
                computerData.get(0),
                computerData.get(1),
                computerData.get(2),
                computerData.get(3),
                computerData.get(4),
                computerData.get(5),
                Short.parseShort(computerData.get(6)),
                Double.parseDouble(computerData.get(7)));

        computer.add(released);

        for (Computer c : computer) //for each person, e represents one person
            //when we call E , we call the to String function from employee class.
            System.out.println(String.format("[%s] " + c, computer.indexOf(c)));
    }


//this is for the order function
    public static void printAll() { //prints all objects
        for (Computer c : computer) //for each person, e represents one person
            //when we call E , we call the to String function from employee class.
            System.out.println(String.format("[%s] " + c, computer.indexOf(c) ));



    }

 /*   static void createCustomer(List<String> customerData) {
        Customer newPerson = new Customer(
                customerData.get(newPerson)); */


        static int searchByName(String brandModel) { //accept the string method
            for (Computer c : computer)
                if (c.getBrandModel().contains(brandModel)) //if the firstName is the same then print out the index!
                    return computer.indexOf(c);

            return -1; //if it did not find the index then you return -1


    }


}
