package bootcamp3.Assignments.PA303_3_1.hackerrankJavaSubstring;

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
