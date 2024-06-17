package bootcamp7.Assignments.PA303_7_1;

/*  Write a program that creates an array of String type and initializes
it with the strings “red,” “green,” “blue,” and “yellow.” Print out the
array length. Make copy using the clone( ) method. Use Arrays.toString( )
method on the new array to verify that the original array was copied.
 */

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        String[] arrStr = {"red", "green", "blue", "yellow"};
        System.out.println(arrStr.length);              // Print out the array length

        String[] arrStrCopy = arrStr.clone();           // Make copy using the clone( ) method
        for (int i = 0; i < arrStrCopy.length; i++) {
            System.out.printf(" %s ", arrStrCopy[i]);   // print individual elements
        }
        System.out.println(Arrays.toString(arrStrCopy)); // Use Arrays.toString( ) to verify
    }
}
