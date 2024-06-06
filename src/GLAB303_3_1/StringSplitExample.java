package bootcamp3.Assignments.GLAB303_3_1;

import java.util.Arrays;

public class StringSplitExample {
    public static void main(String[] args) {

        String vowels = "a::b::c::d:e";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));

    }
}
// result = [a, b, c, d:e]