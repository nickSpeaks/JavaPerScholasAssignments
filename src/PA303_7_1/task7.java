package bootcamp7.Assignments.PA303_7_1;

/* Task 7: Write a program where you create an array of 5 elements.
Loop through the array and print the value of each element, except
for the middle (index 2) element. */

public class task7 {
    public static void main(String[] args) {
        int forbiddenIndex = 2;
        int[] intArray = new int[]{1, 2, 3, 4, 5};    // create an array of 5 elements
        System.out.println(intArray[0]);

        for (int i = 1; i < intArray.length; i++)
            if (i != forbiddenIndex)
                System.out.println(intArray[i]);

    }
}
