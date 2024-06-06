package bootcamp11.Assignments.GLAB303_11_2;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
    public static void main(String args[]) {
        // Creating an ArrayList of String
        List<String> animals = new ArrayList<>();

        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        System.out.println(animals);    // [Lion, Tiger, Cat, Dog]

        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");
        System.out.println(animals);    // [Lion, Tiger, Elephant, Cat, Dog]
    }
}
