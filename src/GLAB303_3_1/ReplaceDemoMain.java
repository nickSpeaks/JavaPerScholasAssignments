package bootcamp3.Assignments.GLAB303_3_1;

/*
* The replace() method replaces each matching occurrence of the
* old character/text in the string with the new character/text.
The syntax of the replace() method is either:

*   stringobj.replace(char oldChar, char newChar)
or
*   stringobj.replace(CharSequence oldText, CharSequence newText)
*
Here, stringobj is an object of the String class.
* */

public class ReplaceDemoMain {
    public static void main(String[] arg) {
        String str1 = "abc cba";

        // all occurrences of 'a' is replaced with 'z'
        System.out.println(str1.replace('a', 'z'));             // zbc cbz

        // all occurrences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J'));           // Java
        // character not in the string
        System.out.println("Hello".replace('4', 'J'));          // Hello
        // all occurrences of "C++" is replaced with "Java"
        System.out.println(str1.replace("C++", "Java"));        // abc cba

        // all occurrences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz")); // zz bb zz zz

        // substring not in the string
        System.out.println("Java".replace("C++", "C"));     // Java
    }
}
// Note: If the substring to be replaced is not in the string, replace() returns the original string.