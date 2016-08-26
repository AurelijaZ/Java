package ComputerShop;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by student on 26-Aug-16.
 */
public class GeneratingCustomer {

    public static Customer person = new Customer ("Aurelija", "Zuba", " 84524105", "123 Disney",
            "07474114211", 868589, new Computer("MacBook Pro", "Intel® Core i5 Processor", " 2.7 GHz", "128 GB SSD",
            "Intel® Iris", "Up to 10 hours", (short) 8, 1200));

    public static List<Customer> customers = new ArrayList<>();

    static void addCustomer() {
        customers.add(person);
    }
}
