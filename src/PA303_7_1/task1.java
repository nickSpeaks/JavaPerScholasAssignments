package bootcamp7.Assignments.PA303_7_1;

/* Write a program that creates an array of integers with a length of 3.
Assign the values 1, 2, and 3 to the indexes. Print out each array element. */

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        System.out.println(" ------- way 1 of printing arrays: -------");
        System.out.println(Arrays.toString(ints));

        System.out.println(" ------- way 2 of printing arrays: -------");
        for (int i:ints) System.out.printf(" %d ", i);
        System.out.println();

        System.out.println(" ------- way 3 of printing arrays: -------");
        for (int i = 0; i < ints.length; i++)
            System.out.printf(" %d ", ints[i]);
    }
}
