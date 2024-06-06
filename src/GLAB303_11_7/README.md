# Guided LAB - 303.11.7 - Phone Directory Using TreeMap
### Objective
In this lab, we will create a basic PhoneDirectory by using a TreeMap to store directory entries.

### Learning Objective:
By the end of this lesson, learners will be able to utilize the TreeMap.

### Scenario
Finds the phone number, if any, for a given name and returns the phone number associated with the name if the name does not occur in the phone directory, and then returns the value as null.

Associates a given name with a given phone number. If the name already exists in the phone directory, the new number replaces the old one. Otherwise, a new name/number pair is added. The name and number should both be non-null. An IllegalArgumentException is thrown if this is not the case.

## Instructions
Step 1: Create a new Java project and create a new Class named “PhoneDirectoryWithTreeMap,” and then write the below code in the class.

    package bootcamp11.Assignments.GLAB303_11_7;

    import java.util.Map;
    import java.util.TreeMap;
    
    public class PhoneDirectoryWithTreeMap {
      /*
      * The TreeMap that will store the data. Both key and value are of the String.
      * The key represents a name and the value represents the associated phone number.
      * */
    
          private TreeMap<String, String> data;
    
          /*
          * Constructor creates an initially empty directory.
          * */
    
          public PhoneDirectoryWithTreeMap() {
              this.data = new TreeMap<String, String>();
          }
    
          /*
          * Finds the phone number, if any, for a given name.
          * @return The phone number associated with the name; if the name does
          * not occur in the phone directory, then the return value is null.
          * */
    
          public String getNumber( String name ) {
              return this.data.get(name);
          }
    
          /*
          * Associates a given name with a given phone number. If the name already exists
          * in the phone directory, then the new number replaces the old one. Otherwise, a
          * new name/number pair is added. The name and number should both be non-null.
          * An IllegalArgumentException is thrown if this is not the case.
          * */
    
          public void putNumber( String name, String number ) {
              if (name == null || number == null)
                  throw new IllegalArgumentException("name and number cannot be bull");
              this.data.put(name,number);
          }
    
          /*  Write the contents of the phone directory to System.out.
          * */
    
          public void print() {
              for (Map.Entry<String, String> entry : this.data.entrySet())
                  System.out.println( entry.getKey() + ": " + entry.getValue() );
          }
      } // end class PhoneDirectoryWithTreeMap

Step 2: Create a new Java project and create a new Class named “TestPhoneDirectoryWithTreeMap,” and then write the code below in the class.

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

### Submission Instructions:
Include the following deliverables in your submission -
* Submit your source code using the Start Assignment button in the top-right corner of the assignment page in Canvas.