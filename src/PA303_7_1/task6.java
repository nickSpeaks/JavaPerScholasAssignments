package bootcamp7.Assignments.PA303_7_1;

/* Task 6: Write a program where you create an integer array of 5 numbers.
Loop through the array and assign the value of the loop control variable
multiplied by 2 to the corresponding index in the array. */

public class task6 {
    public static void main(String[] args) {
        int[] intArray = new int[5];

        for (int i =0; i < intArray.length; i++) {
            intArray[i] = i * 2;
            System.out.printf(" %d ", intArray[i]); //  0  2  4  6  8
        }
    }
}
