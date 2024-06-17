package bootcamp7.Assignments.PA303_7_1;

/* Task 8: Write a program that creates a String array
of 5 elements and swaps the first element with the middle
element without creating a new array. */

import java.util.Arrays;

public class task8 {
    public static void main(String[] args) {
        String[] array = new String[]{"one", "two", "three", "four", "five"};
        String temp = array[2];
        array[2] = array[0];
        array[0] = temp;

        System.out.println(Arrays.toString(array));
    }
}
