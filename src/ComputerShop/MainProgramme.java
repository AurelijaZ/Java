package ComputerShop;

import static ComputerShop.GeneratingComputer.computer;
import static ComputerShop.TaskProcessing.BY_PRICE;

/**
 * Created by student on 26-Aug-16.
 */
public class MainProgramme {

    public static void main(String[] args) {
     //   GeneratingComputer.addComputer();



        for (Computer c : computer) {
            System.out.println(c);
        }

        computer.sort(BY_PRICE);

        for (Computer c : computer) {
            System.out.println(c);
        }

        Command.display();

    }
}
