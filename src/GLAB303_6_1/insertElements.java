package bootcamp6.Assignments.GLAB303_6_1;

import java.util.Scanner;

public class insertElements {
    public static void main(String[] args) {
        int i, element;
        int[] arr = new int[11];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 10 Elements: ");
        for (i = 0; i < 10; i++)
            arr[i] = scan.nextInt();

        System.out.print("Enter an Element to Insert: ");
        element = scan.nextInt();
        arr[i] = element;

        System.out.println("\nNow the new array is: ");
        for (i = 0; i < 11; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}

//Enter 10 Elements:
//        2
//        3
//        4
//        5
//        6
//        7
//        4
//        3
//        2
//        45
//Enter an Element to Insert: 34
//
//Now the new array is:
//        2
//        3
//        4
//        5
//        6
//        7
//        4
//        3
//        2
//        45
//        34