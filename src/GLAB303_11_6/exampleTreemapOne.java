package bootcamp11.Assignments.GLAB303_11_6;

import java.util.TreeMap;

public class exampleTreemapOne {
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);  // TreeMap: {One=1, Three=3, Two=2}

        // remove method with single parameters
        int value = numbers.remove("Two");
        System.out.println("Removed Value: " + value);  // Removed Value: 2

        // remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed?" + result); // Is the entry {Three=3} removed?true
        System.out.println("Updated TreeMap: " + numbers);              // Updated TreeMap: {One=1}
    }
}
