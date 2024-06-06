package bootcamp3.Assignments.GLAB303_3_1;

/*
 * The substring() method extracts a substring from the string and returns it.
 * The syntax of the substring() method is

 *           stringObj.substring(int startIndex, int endIndex)
 * */

public class substringDemo {
    public static void main(String[] arg) {
        String str1 = "java is fun";

        // extract substring from index 0 to 3
        System.out.println(str1.substring(0, 4));       // OUTPUT: java
    }
}
