package ComputerShop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 26-Aug-16.
 */
public class GeneratingComputer {

    public static Computer Mac = new Computer ("MacBook Pro", "Intel® Core™ i5 Processor", " 2.7 GHz", "128 GB SSD",
            "Intel® Iris", "Up to 10 hours", (short) 8, 1200);

    public static Computer Mac2 = new Computer ("MacBook Pro Cheap", "Intel® Core™ i5 Processor", " 2.7 GHz", "128 GB SSD",
            "Intel® Iris", "Up to 10 hours", (short) 8, 800);

    public static List<Computer> computer = new ArrayList<>();

    static void addComputer() {

        computer.add(Mac);
        computer.add(Mac2);
    }

}
