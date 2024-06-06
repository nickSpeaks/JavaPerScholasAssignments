package bootcamp11.Assignments.GLAB303_11_7;

public class TestPhoneDirectoryWithTreeMap {
    public static void main(String[] args) {
        PhoneDirectoryWithTreeMap directory = new PhoneDirectoryWithTreeMap();
        System.out.println("This program creates a PhoneDirectoryWithTreeMap and");
        System.out.println("adds several entries. It then prints the ocntents of");
        System.out.println("directory and does a few lookups.");
        System.out.println();
        directory.putNumber("Fred", "555-1234");
        directory.putNumber("Barney", "555-2345");
        directory.putNumber("Wilma", "5555-3456");
        directory.putNumber("Wilma", "5555-3456");
        directory.putNumber("Wilma", "555-2563");
        // directory.putNumber();
        // directory.putNumber();

        System.out.println("Contents are:");
        System.out.println();
        directory.print();                      //
        System.out.println();
        System.out.println("Number for Fred is " + directory.getNumber("Fred"));
        System.out.println("Number for Wilma is " + directory.getNumber("Wilma"));
        System.out.println("Number for Tom is " + directory.getNumber("Tom"));
        System.out.println("Number for Tom is " + directory.getNumber("Alex"));
        // The output from the last line should be null
    }
}
//This program creates a PhoneDirectoryWithTreeMap and
//adds several entries. It then prints the ocntents of
//directory and does a few lookups.
//
//Contents are:
//
//Barney: 555-2345
//Fred: 555-1234
//Wilma: 555-2563
//
//Number for Fred is 555-1234
//Number for Wilma is 555-2563
//Number for Tom is null
//Number for Tom is null