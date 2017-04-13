import java.util.Scanner;

/**
 * Exercises one through ten (starting on pg65, ending on pg69)
 * in my Java Bootcamp Workbook.
 * @author Sarah Guarino
 * @version 1.0
 */
public class Exercises1Through10 {
    private static Scanner scnr = new Scanner(System.in);
    public static void main(String[] args) {
        //Exercise 1
        //prompt the user to enter a string.
        //receive that response from the console
        //output that response back to the console

        String someText;

        System.out.println("Exercise 1");
        System.out.print("\tEnter some text: ");
        someText = scnr.nextLine();
        System.out.println("\t" + someText + "\n");

        //Exercise 2
        //prompt the user to enter a number
        //add 1 to that number
        //print the new number to the console

        int someInt;

        System.out.println("Exercise 2");
        System.out.print("\tEnter a number: ");
        someInt = scnr.nextInt() + 1;
        System.out.println("\t" + someInt + "\n");

        //Exercise 3
        //prompt the user to enter a number
        //add 0.5 to the number
        // print it back to the console

        double someDouble;

        System.out.println("Exercise 3");
        System.out.print("\tEnter a number: ");
        someDouble = scnr.nextDouble() + 0.5;
        System.out.println("\t" + someDouble + "\n");

    }
}
