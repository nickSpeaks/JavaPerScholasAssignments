package bootcamp7.Assignments.PA303_7_1;

/* Write a program that returns the middle element in an array. Give the following
values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7 */

public class task2 {
    public static void main(String[] args) {
        int[] intArray = new int[] {13, 5, 7, 68, 2};

        int middleELementIndex = 0;

        if (intArray.length % 2 != 0)
            middleELementIndex = intArray.length / 2;
        else
            middleELementIndex = intArray.length / 2 - 1;

        System.out.println(intArray[middleELementIndex]);
    }
}
