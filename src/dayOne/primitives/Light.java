package dayOne.primitives;
import java.util.Scanner;
/**
 * Created by student on 22-Aug-16.
 */

public class Light {

    static int lightSpeed = 186000;

    public static void main (String [] args) {
        System.out.print("Enter number of days: ");
        Scanner input = new Scanner (System.in);
        long days = input.nextLong();



        //Streams
        System.out.println("In " + days);
        System.out.println(" days light will travel about  " + lightCalculator(days) + " miles.");
    }

    static long lightCalculator(long days) {
        long seconds = days * 24 * 60 * 60;
        return lightSpeed * seconds;

    }
}

