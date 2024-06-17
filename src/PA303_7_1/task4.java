package bootcamp7.Assignments.PA303_7_1;

/* Write a program that creates an integer array with 5 elements (i.e., numbers). The
numbers can be any integers.  Print out the value at the first index and the last index
using length - 1 as the index. Now try printing the value at index = length (e.g.,
myArray[myArray.length] ).  Notice the type of exception which is produced. Now try to
assign a value to the array index 5. You should get the same type of exception.
 */


import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 10, 2, 20, 3};
        System.out.println("A new arrray: " + Arrays.toString(intArray));

        System.out.println(intArray[0]);            // Print out the value at the first index
        System.out.println(intArray[intArray.length-1]);    // using length - 1 as the index
        // System.out.println(intArray[intArray.length]); throws ArrayIndexOutOfBoundsException
        // intArray[5] = 100;  throws ArrayIndexOutOfBoundsException

    }
}
