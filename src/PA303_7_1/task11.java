package bootcamp7.Assignments.PA303_7_1;

/* Task 11: Write some Java code that asks the user how many
favorite things they have. Based on their answer, you should
create a String array of the correct size. Then ask the user
to enter the things and store them in the array you created.
Finally, print out the contents of the array.

        Example
        How many favorite things do you have?
        7

        Enter your thing: phone
        Enter your thing: tv
        Enter your thing: xbox
        Enter your thing: wine
        Enter your thing: beer
        Enter your thing: sofa
        Enter your thing: book
        Your favorite  things are:
        phone tv xbox wine beer sofa book
*/

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {

        System.out.print("How many favorite things do you have? ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String[] array = new String[number];  // create a String array of the correct size

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter your thing: ");
            array[i] = scanner.next();

        }
        System.out.println();
        System.out.println("Your favorite things are:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s ",array[i]);
        }
        scanner.close();
    }
}
