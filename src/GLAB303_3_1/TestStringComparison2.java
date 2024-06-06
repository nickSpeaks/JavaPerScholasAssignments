package bootcamp3.Assignments.GLAB303_3_1;

/* The == operator compares references, not values. */

public class TestStringComparison2 {
    public static void main(String[] arg) {
        String s1 = "Perscholas";
        String s2 = "Perscholas";
        String s3 = new String("Perscholas");

        System.out.println(s1 == s2);     //true (because both refer to same instance)
        System.out.println(s1 == s3);     //false (because s3 refers to instance created in non-pool)
    }
}
// The above code demonstrates the use of == operator used for comparing two String objects.
