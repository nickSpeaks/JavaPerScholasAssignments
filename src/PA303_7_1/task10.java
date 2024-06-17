package bootcamp7.Assignments.PA303_7_1;

/* Create an array that includes an integer, 3 strings, and 1 double. Print the array. */

public class task10 {
    public static void main(String[] args) {
        Object[] array = new Object[]{1, "two", "three", "four", 10.50};

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}
