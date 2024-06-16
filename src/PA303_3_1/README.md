# PA 303.3.1 - Practice Assignment - Strings
### Objective
This assignment will test your knowledge of Java Strings data type.
### Instructions
This assessment will be administered through HackerRank. Please complete the following Java String assignments by opening the links below.

Note: Invitation is not required.
## Java Strings Introduction
https://www.hackerrank.com/challenges/java-strings-introduction/problem

The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters, A and B, perform the following operations:
1. Sum the lengths of A and B.
2. Determine if A is lexicographically larger than B (i.e.: does  come before  in the dictionary?).
3. Capitalize the first letter in A and B and print them on a single line, separated by a space.

       package bootcamp3.Assignments.PA303_3_1;

       import java.util.Scanner;
    
       public class JavaStringsIntroduction {
       public static void main(String[] arg) {
           Scanner sc = new Scanner(System.in);
           String A = sc.next();
           String B = sc.next();

           int totalLength = A.length() + B.length();
           System.out.println(totalLength);

           if (A.compareTo(B)>0) {
               System.out.println("Yes");
           } else {
               System.out.println("No");
           }

           String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
           String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
           System.out.println(capitalizedA + " " + capitalizedB);
           }
       }

       //9
       //No
       //Hello Java

## Java Substring
https://www.hackerrank.com/challenges/java-substring/problem

Given a string, s, and two indices, 'start' and 'end', print a substring consisting of all characters in the inclusive range from 'start' to 'end'. You'll find the String class' substring method helpful in completing this challenge.

      package bootcamp3.Assignments.PA303_3_1;
      
      import java.util.Scanner;
      
      public class JavaSubstring {
      public static void main(String[] ags) {
         Scanner in = new Scanner(System.in);
         String S = in.next();
         int start = in.nextInt();
         int end = in.nextInt();
         System.out.println(S.substring(start, end));
      
         }
      }

## Java Substring Comparisons
https://www.hackerrank.com/challenges/java-string-compare/problem

Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length .

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

## Java String Reverse
https://www.hackerrank.com/challenges/java-string-reverse/problem

      package bootcamp3.Assignments.PA303_3_1;
      
      import java.util.Scanner;
      
      public class JavaStringReverse {
      public static void main(String[] arg) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        int len = A.length()-1;
        String rev = "";

        for (int i = len; i >= 0; --i) {
            rev += A.charAt(i);
        }

        if (A.equals(rev)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
       }
      }

## Java String Tokens
https://www.hackerrank.com/challenges/java-string-tokens/problem

### Submission Instructions:
Include the following deliverables in your submission
Submit the link to your HackerRank profile using the 'Start Assignment' button in the top-right corner of the assignment page in Canvas.

