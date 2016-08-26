package dayTwo;


import static dayTwo.generatingPeople.people;
/**
 * Created by student on 23-Aug-16.
 */
public class MainProgramme {
    public static void main (String[] args) throws Exception {
       /* generatingPeople.addPeople();

        for (Person p : people) {
            System.out.println(p);
        }*/
        //commandGUI.display();
       // generatingPeople.addPeople(); for static value
        //TaskProcessing.executeGUI();
        TaskProcessing.prepareDb();
        new WelcomeWindow(); //

    }

}
