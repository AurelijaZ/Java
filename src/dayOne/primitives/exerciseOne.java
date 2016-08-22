package dayOne.primitives;
import java.io.IOException;
import java.util.Scanner;
/**
 * Created by student on 22-Aug-16.
 */
public class exerciseOne {

    public static void main (String[] args) {
        numberCheck();

    }
    static void numberCheck() {


        System.out.print("Enter a number between 0 - 2000: ");
        Scanner inputChar = new Scanner(System.in);
        char c = inputChar.next().charAt(0);

        Character.isUpperCase(c);
        Character.isLowerCase(c);
        Character.isDigit(c);

        int num = inputChar.nextInt();
        String result;

         if ( num > 100 ) {
        result = "Your number is equal to 100"; }
        else if (num > 100  || num > 500){
             result = "Your number is equal to 500";}
        else
         { result = "Your Number is beyond our scope"; }


        System.out.println( result);

    }



    static void Menu() {
        try {
            char choice;
            do {
                System.out.println("Helper Menu: ");
                System.out.println("1. if");
                System.out.println("2. Switch");
                System.out.println("3. while");
                System.out.println("4. do-while");
                choice = (char) System.in.read();
            }   while (choice < '1' || choice > '4'); switch(choice) {
case 1:     }
      } catch (IOException e ) {
            System.out.println(e.getMessage());
        }

    }
}



