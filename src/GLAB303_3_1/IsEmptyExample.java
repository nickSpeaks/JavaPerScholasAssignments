package bootcamp3.Assignments.GLAB303_3_1;
/*
* This method checks whether the String contains anything or not.
* If the Java String is empty, it returns true or false.
*/
public class IsEmptyExample {
    public static void main(String[] arg) {
        String s1="";
        String s2="hello";

        System.out.println(s1.isEmpty());      // true
        System.out.println(s2.isEmpty());      // false
    }

    /*
    * The Java string trim() method removes the leading and trailing spaces. It checks
    * the Unicode value of the space character (‘\u0020’) before and after the string.
    * If it exists, then remove the spaces and return the omitted string.

     * */
    public static class SrtingTrimExample {
        public static void main(String[] arg) {
            String s1="  hello   ";

            System.out.println(s1+"how are you");
            System.out.println(s1.trim()+"how are you");
        }
    }
}
