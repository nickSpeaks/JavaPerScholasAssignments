package bootcamp11.Assignments.GLAB303_11_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveElementsFromArrayList {
    public static void main(String args[]) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial LIst: " + programmingLanguages);  // [C, C++, Java, Kotlin, Python, Perl, Ruby]

        // Remove the element at index `5`
        programmingLanguages.remove(5);
        System.out.println("After remove(5): " + programmingLanguages);     // [C, C++, Java, Kotlin, Python, Ruby]

        // Remove the first occurrence of the given element from the ArrayList
        // (The remove() method returns false if the element does not exist in the ArrayList)
        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\"): " + programmingLanguages);    // [C, C++, Java, Python, Ruby]

        // Remove all the elements that exist in a given collection
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages); // [C, C++, Java]

        programmingLanguages.clear();
        System.out.println("After clear(): " + programmingLanguages);   // After clear(): []
    }
}
