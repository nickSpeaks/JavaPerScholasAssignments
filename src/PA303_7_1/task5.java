package bootcamp7.Assignments.PA303_7_1;

/* Task 5: Write a program where you create an integer array with a
length of 5. Loop through the array and assign the value of the loop
control variable (e.g., i) to the corresponding index in the array. */

public class task5 {
    public static void main(String[] args) {
        int[] intArray = new int[5];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }
        for (int i:intArray) System.out.printf(" %d ", intArray[i]);
    }
}
