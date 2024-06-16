package bootcamp3.Assignments.PA303_3_1.hackerrankJavaStringReverse;

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
