package addressBook;

import java.time.LocalDate;
import java.util.List;

import static addressBook.generateContact.contact;
// import static dayTwo.generatingPeople.people;

/**
 * Created by student on 23-Aug-16.
 */
public class TaskProcessing {
    static void createContact(List<String> data) {

        Contact temp = new Contact(
                new Person(LocalDate.of(
                        Integer.parseInt(data.get(0)),
                        Integer.parseInt(data.get(1)),
                        Integer.parseInt(data.get(2))),
                        data.get(3), data.get(4)),
                new Address(data.get(4), data.get(5)),
                data.get(6), data.get(7), data.get(8), data.get(9));


        contact.add(temp);
    }

    public static void printAll() { //prints all objects
        for (Contact c : contact) //for each person, c represents one person
            //when we call C , we call the to String function from employee class.
            System.out.println(String.format("[%s] " + c, contact.indexOf(c)));
    }

    static int searchByFirstName(String firstName) { //accept the string method
        for (Contact c : contact)
            if (c.getFirstName().contains(firstName)) //if the firstName is the same then print out the index!
                return contact.indexOf(c);

        return -1; //if it did not find the index then you return -1
    }

    //editing
    static void editDetail(int index, List<String> data) {
        contact.get(index).setBirthDate(LocalDate.of(
                Integer.parseInt(data.get(0)),
                Integer.parseInt(data.get(1)),
                Integer.parseInt(data.get(2))));
        contact.get(index).setFirstName(data.get(3));
        contact.get(index).setLastName(data.get(4));
        contact.get(index).setFirstLine(data.get(5));
        contact.get(index).setPostcode(data.get(6));
        contact.get(index).setEmail(data.get(7));
        contact.get(index).setFacebook(data.get(8));
        contact.get(index).setPhoneNum(data.get(9));
        contact.get(index).setTwitter(data.get(10));

    }
    static void removeEmployee(int index) {
        contact.remove(index);
    }
}

