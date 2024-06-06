package bootcamp3.Assignments.GLAB303_3_1;

/*The String class's compareTo() method compares values lexicographically.
It returns an integer value that describes if the first string is less than,
equal to, or greater than the second string.

return 0 if this string is the same as another;
<0 if lexicographically less than another; or >0

Suppose s1 and s2 are two String objects. If:
s1 == s2 : The method returns 0.
s1 > s2 : The method returns a positive value.
s1 < s2 : The method returns a negative value.
*/

public class TestStringComparison3 {
    public static void main(String[] arg) {
        String s1 = "Perscholas";
        String s2 = "Perscholas";
        String s3 = "Perschola";
        String s4 = "PerscholasX";

        System.out.println(s1.compareTo(s2));   // 0
        System.out.println(s1.compareTo(s3));   // 1        (because s1 > s3)
        System.out.println(s1.compareTo(s4));   // -1       (because s1 < s4 )
    }
}
