package bootcamp11.Assignments.GLAB303_11_5;

import java.util.HashSet;

public class ExampleTwoUnionOfSets {
    public static void main(String[] args) {
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet1: " + evenNumbers); // HashSet1: [2, 4]

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("HashSet2: " + numbers);     // HashSet2: [1, 3]

        // Union of two set
        numbers.addAll(evenNumbers);
        System.out.println("Union is: " + numbers);     // Union is: [1, 2, 3, 4]
    }
}
