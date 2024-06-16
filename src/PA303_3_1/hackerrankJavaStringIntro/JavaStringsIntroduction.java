package bootcamp3.Assignments.PA303_3_1.hackerrankJavaStringIntro;

import java.util.*;

public class JavaStringsIntroduction {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        /* Enter your code here. Print output to STDOUT. */
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
