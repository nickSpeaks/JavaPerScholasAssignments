package bootcamp11.Assignments.GLAB303_11_2;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();
        // Check if an ArrayList is empty
        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty()); // true

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        // Find the size of an ArrayList
        System.out.println("Here are the top " + topCompanies.size() + " companies in the world");  // 5

        System.out.println(topCompanies);       // [Google, Apple, Microsoft, Amazon, Facebook]

        // Retrieve the element at a given index
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best Company: " + bestCompany);                 // Google
        System.out.println("Second Best Company: " + secondBestCompany);    // Apple
        System.out.println("Last Company in the list: " + lastCompany);     // Facebook

        // Modify the element at a given index
        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list: " + topCompanies); // [Google, Apple, Microsoft, Amazon, Walmart]
    }
}
