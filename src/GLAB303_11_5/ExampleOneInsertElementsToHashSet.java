package bootcamp11.Assignments.GLAB303_11_5;

import java.util.HashSet;

public class ExampleOneInsertElementsToHashSet {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();

        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);   // HashSet: [2, 4, 6]

        HashSet<Integer> numbers = new HashSet<>();

        // Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);  // New HashSet: [2, 4, 5, 6]
    }
}
