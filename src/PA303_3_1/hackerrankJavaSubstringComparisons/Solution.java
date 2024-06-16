package bootcamp3.Assignments.PA303_3_1.hackerrankJavaSubstringComparisons;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        // Complete the function
        String currentSubString = s.substring(0, k);
        String smallest = currentSubString;
        String largest = currentSubString;

        for (int i = 1; i <= s.length() - k; i++) {
            currentSubString = s.substring(i, i + k);

            // 'largest' must be the lexicographically largest substring of length 'k'
            if (currentSubString.compareTo(largest) > 0) {
                largest = currentSubString;
            }
            // smallest' must be the lexicographically smallest substring of length 'k'
            if (currentSubString.compareTo(smallest) < 0) {
                smallest = currentSubString;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}