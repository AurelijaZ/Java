package addressBook;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 23-Aug-16.
 */
public class generateContact {
    public static Contact con1 = new Contact(new Person(LocalDate.of(1994, 1, 27), "Aurelija", "Zuba"), new Address("123",
             "FL0 R14"),  "aurelijazuba@gmail.com",
            "Aurelija","07474114211", "Zuba");


    public static List<Contact> contact = new ArrayList<>();

    static void addContact() {
        contact.add(con1);

    }
}
