package bootcamp11.Assignments.GLAB303_11_5;

import java.util.TreeSet;

public class ExampleTwoRemoveElementsFromSet {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);      // TreeSet: [2, 5, 6]

        // Using the remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);  // Is 5 removed? true

        // Using the removeAll() method
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);  // Are all elements removed? true
    }
}
