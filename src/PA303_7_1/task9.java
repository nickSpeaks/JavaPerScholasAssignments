package bootcamp7.Assignments.PA303_7_1;

/* Write a program to sort the following int array in ascending
order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order,
and print the smallest and the largest element of the array. The
output will look like the following:
        Array in ascending order: 0, 1, 2, 4, 9, 13
        The smallest number is 0
        The biggest number is 13 */

import java.util.Arrays;

public class task9 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 9, 13, 1, 0};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));   // Print the array in ascending order
        System.out.printf("The smallest number is %d%n", arr[0]);   // The smallest number is 0
        System.out.printf("The biggest number is %d%n", arr[arr.length-1]); // The biggest number is 13



    }
}
