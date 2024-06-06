package bootcamp3.Assignments.GLAB303_3_1;

/*
 * The indexOf() method returns the index of the first occurrence
 * of the specified character/substring within the string.
 * */

public class findString {
    public static void main(String[] arg) {
        String str1 = "Java is fun";
        int result;

        // getting index of character 's'
        result = str1.indexOf('s');

        System.out.println(result);                 // 6

        // getting index of character 'J'
        result = str1.lastIndexOf('J');
        System.out.println(result);                 // 0

        // the last occurrence of 'a' is returned
        result = str1.lastIndexOf('a');
        System.out.println(result);                 // 3

        // character not in the string
        result = str1.lastIndexOf('j');
        System.out.println(result); //              -1

        // getting the last occurrence of "ava"
        result = str1.lastIndexOf("ava");
        System.out.println(result);                 // 1

        // substring not in the string
        result = str1.lastIndexOf("java");
        System.out.println(result);                 // -1
    }
}

