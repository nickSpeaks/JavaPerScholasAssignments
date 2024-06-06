package bootcamp3.Assignments.GLAB303_3_1;

/*
 * The String class's equals() method compares the original content of the string.
 * It compares the values of strings for equality.
 * */

public class TestStringComparison {
    public static void main(String[] arg) {
        String s1="PerScholas";
        String s2="PerScholas";
        String s3=new String("PerScholas");
        String s4="Teksystem";

        System.out.println(s1.equals(s2));      //true
        System.out.println(s1.equals(s3));      //true
        System.out.println(s1.equals(s4));      //false
    }
}
/*In the above code, two strings are compared to using the equals() method of String class.
The result is printed as Boolean values, true or false.*/
