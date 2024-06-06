package bootcamp11.Assignments.GLAB303_11_5;

import java.util.HashSet;

public class ExampleThreeDifferenceOfSets {
    public static void main(String[] args) {
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("HashSet1: " + primeNumbers);    // HashSet1: [2, 3, 5]

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("HashSet2: " + oddNumbers);      // HashSet2: [1, 3, 5]

        // Difference between HashSet1 and HashSet2
        primeNumbers.removeAll(oddNumbers);
        System.out.println("Difference: " + primeNumbers);  // Difference: [2]
    }
}
