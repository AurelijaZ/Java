package dayOne.primitives;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by student on 22-Aug-16.
 */
public class ControlStatements {

    public static void main(String[] args) {
        //numberCheck()
        // WhileInfinite();
        //ForLoopTest();
        BinaryApplication();
    }


    static void numberCheck() {
        int num = 0;
        String result;

        System.out.print("Enter a number between 0 - 2000: ");
        Scanner inputChar = new Scanner(System.in);
        char c = inputChar.next().charAt(0);

        Character.isUpperCase(c);
        Character.isLowerCase(c);
        Character.isDigit(c);


        if (num < 100)
            result = "Your number is equal to 100";
        else if (num > 100 || num > 500)
            result = "Your number is equal to 500";
        else
            result = "Your Number is beyond our scope";


        System.out.println(result);

    }

    static void iceCream() {
        System.out.print("Please enter what size of cone, you would like: ");
        {
            try {
                char choice;
                do {
                    System.out.println("Helper Menu: ");
                    System.out.println("1. if");
                    System.out.println("2. Switch");
                    System.out.println("3. while");
                    System.out.println("4. do-while");
                    choice = (char) System.in.read();
                }


                while (choice < '1' || choice > '4');

                switch (choice) {
                    case '1':
                        System.out.println("The cost of small cone is £1.25");
                        break;
                    case '2':
                        System.out.println("The cost of medium cone is £2.25");
                        break;
                    case '3':
                        System.out.println("The cost of the large cone is £3.25");
                        break;
                    case '4':
                        System.out.println("The cost of the huge cone is £4.00");
                        break;
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }


}
    static void values() {
        Scanner input = new Scanner(System.in);
    }

static void WhileInfinite() {
        int index = 0;

    while (true) {

        int value = ++index;

        System.out.println(value);

        if(value == 5) {
            System.out.println("Found it!");
            break;
        }
    if (value == 10) {
        break;
                 }
             }
         }

static void ForLoopTest() {
    String[] data = { "This", "is", "a", "string."};

    for(int i=0; i <= data.length -1; i++) {
        System.out.println(data[i]);
    }
    String result = "";
    //each string using s in data
    for (String s : data) {
        result += String.format(s + " ");
    }
    System.out.println(result);
    }

    static void BinaryApplication() {
        System.out.println("Enter a value: ");
        Scanner input = new Scanner(System.in);
        String binary = input.nextLine();



        int result = 0, multi = 1;

        for (int i = binary.length() -1; i >= 0; i--) {
            if (binary.charAt(i) == '1')
                result += multi;
            multi = multi * 2;

        }
        System.out.println("Decimal value: " + result);



            }


}
