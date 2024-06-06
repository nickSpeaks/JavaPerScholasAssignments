# Guided LAB - 303.5.1 - for loop
### Objective
In this lab, we will learn how to use for loop in Java with the help of examples and we will also learn about the workings of Loop in computer programming.

### Learning Objective
By the end of this lab, learners will be able to use for loop in Java.

## Overview of the Loop
A simple for loop allows us to iterate over items until a specified condition is met or satisfied. This normally works with the help of a counter, which will be initialized at the start of the execution and will be incremented with each iteration.

Based on the Java doc definition, a simple for loop has the following syntax:

    for (initialization; termination; increment) {
        statement(s)
    }

## Example 1: Display a Text Five Times

    package bootcamp5.Assignments.GLAB303_5_1;

    public class LoopDemoOne {
    public static void main(String[] args) {
        int n = 5;

        // for loop
        for (int i = 1; i <= n; ++i) {
            System.out.println("Java is fun");
        }
        }
    }

OUTPUT

    //Java is fun
    //Java is fun
    //Java is fun
    //Java is fun
    //Java is fun
    
## Example 2: Display Sum of n Natural Numbers

    package bootcamp5.Assignments.GLAB303_5_1;

    public class DisplaySumOfnNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1000;

        // for loop
        for (int i = 1; i <= n; ++i) {
            // body inside for loop
            sum += i;                       // sum = sum + i
        }
        System.out.println("Sum = " + sum); // Sum = 500500
        }
    }

The value of sum is 0 initially. Then the for loop is iterated from i = 1 to 1000. In each iteration, i is added to the sum and its value is increased by 1.

When i becomes 1001, the test condition is false, and the sum will be equal to 0 + 1 + 2 + .... + 1000.

## Example 3: Palindrome
In this example, we are going to see whether a number is a palindrome. A for loop is used in this case. A palindrome number, when reversed, represents the same number.

    package bootcamp5.Assignments.GLAB303_5_1;

    import java.util.Scanner;
    
    public class PalindromeExample {
    public static void main(String[] args) {
        String original, reverse = "";      // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome: ");

        original = in.nextLine();
        int length = original.length();

        for (int i = length - 1; i > 0; i--)
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse)) {
            System.out.println("Entered string/number is a palindrome");
        } else {
            System.out.println("Entered string/number isn't a palindrome");
        }
        }
    }

## Example 4: Pyramid
In this example, we are going to see another application of for loop, which is a nested for loop. A nested for loop refers to a for loop within a for loop. This means that two for-loops are inside each other. They are generally used to print complex patterns on a Java platform. An example of a nested for loop is shown below.

Here, the class name is PyramidExample. The main() is declared. After that, the two loop control variables are declared. One is the loop control variable “i,” and the other is the loop control variable “j.” Then the “*” is printed in the loop control. 

The new line is given so that the given format of the pyramid structure is maintained. In this code, the program runs five times. However, by increasing the value of the letter “i,” we can make sure that the pyramid is bigger.
    
    package bootcamp5.Assignments.GLAB303_5_1;

    public class PyramidExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= i; j++) {
        System.out.print("* ");
        }
        System.out.println();   // new line
        }
        }
    }

OUTPUT

    //        *
    //        * *
    //        * * *
    //        * * * *
    //        * * * * *