package bootcamp3.Assignments.GLAB303_3_1;

public class lengthdemo {
    public static void main(String[] arg) {
        String str1 = "Java";
        String str2 = "";

        System.out.println(str1.length());          // 4
        System.out.println(str2.length());          // 0
        System.out.println("Java".length());        // 4
        System.out.println("Java\n".length());      // 5
        System.out.println("Learn Java".length()); // 10
    }

    public static class StringLowerExample {
        public static void main(String[] arg) {
            String s1="HELLO HOW Are You?";
            String s1lower=s1.toLowerCase();
            System.out.println(s1lower);    // hello how are you?
        }
    }
}
