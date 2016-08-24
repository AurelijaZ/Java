package dayTwo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 23-Aug-16.
 */
public class generatingPeople {
  /*  public static Person aurelija = new Person("Aurelija", "Zuba", (short)153, 59,
    LocalDate.of(1994,1,27), SexType.FEMALE);

    public static Person harry = new Person("Harry", "Potter", (short)153, 59,
        LocalDate.of(1984,1,27), SexType.MALE); */

    public static Employee fox = new Employee("Fox", "Mulder", (short)168, 65,
            LocalDate.of(1994,1,27), SexType.MALE,  LocalDate.of(1995, 10, 16),"X-File specialist");


    public static List<Employee> people = new ArrayList<>();

    static void addPeople(){
       // people.add(aurelija);
        //people.add(harry);
       people.add(fox);

    }
}
