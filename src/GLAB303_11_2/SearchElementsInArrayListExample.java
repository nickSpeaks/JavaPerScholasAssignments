package bootcamp11.Assignments.GLAB303_11_2;

import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayListExample {
    public static void main(String args[]) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        // Check if an ArrayList contains a given element
        System.out.println("Does names array contain \"Bob\"? : " + names.contains("Bob")); // true

        // Find the index of the first occurrence of an element in an ArrayList
        System.out.println("indexOf \"Steve\": " + names.indexOf("Steve"));     // 3
        System.out.println("indexOf \"Mark\" : " + names.indexOf("Mark"));      // -1

        // Find the index of the last occurrence of an element in an ArrayList
        System.out.println("lastIndexOf \" John\" :" + names.lastIndexOf("John"));  // 4
        System.out.println("lastIndexOf \" Bill\" : " + names.lastIndexOf("Bill")); // -1
    }
}
