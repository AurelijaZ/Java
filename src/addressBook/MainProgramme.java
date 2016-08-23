package addressBook;

import static addressBook.generateContact.contact;

/**
 * Created by student on 23-Aug-16.
 */
public class MainProgramme {
    public static void main(String[] args) {
        generateContact.addContact();

        for (Contact c : contact)

        {
            System.out.println(c);
        }
    }
}

