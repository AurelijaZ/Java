package dayTwo;


import static dayTwo.generatingPeople.people;
/**
 * Created by student on 23-Aug-16.
 */
public class MainProgramme {
    public static void main (String[] args) {
       /* generatingPeople.addPeople();

        for (Person p : people) {
            System.out.println(p);
        }*/
        //commandGUI.display();
        generatingPeople.addPeople();
        //TaskProcessing.executeGUI();
        WelcomeWindow entry = new WelcomeWindow(); //
    }

}
