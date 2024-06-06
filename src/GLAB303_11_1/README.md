# Guided LAB - 303.11.1 - Generic Method and Class
#### Lab Objective
In this lab, we will demonstrate a generic method and class. 
By the end of this lab, learners will be able to utilize the generic method and class.
## Example: Java Generics Method
We can create a method that can be used with any type of data. That method is known as the Generics Method.

Create a class named DemoClass. As shown below, we will create a generic method in this class:

        package bootcamp11.Assignments.GLAB303_11_1;

        public class DemoClass {
    
        // create a generic method
        public <T> void genericMethod(T data) {
            System.out.println("Generic Method:");
            System.out.println("Data passed: " + data);
        }
    }

Create a class named myRunner. In this class, we will invoke the generic method

    package bootcamp11.Assignments.GLAB303_11_1;

    public class myRunner {
    public static void main(String[] args) {
        // initialize the class with Integer data
        DemoClass dObj = new DemoClass();
        dObj.genericMethod(25);                 // passing int
        dObj.genericMethod("Per Scholas");      // passing String
        dObj.genericMethod(2563.5);             // passing float
        dObj.genericMethod('H');                // passing Char
        }
    }

    // OUTPUT:
    //Generic Method:
    //Data passed: 25
    //Generic Method:
    //Data passed: Per Scholas
    //Generic Method:
    //Data passed: 2563.5
    //Generic Method:
    //Data passed: H

In the above example, we have created a generic method named genericsMethod.

    public <T> void genericMethod(T data) {...}

Here, the type parameter <T> is inserted after the public modifier and before the return type void

We can call the generics method by placing the actual type <String> and <Integer> inside the bracket before the method name.

## Example: Generic Class
A class can have more than one type parameter. In this case, the type parameters are separated by a comma.

For the demonstration, we will initialize two type parameters in the Generic class. The names of the parameter types will be Datatypeone and
DatatypeTwo, but these are only names. You are free to use “X” or “Z,” or  any other identifier to name parameters.

Create a class named GMultipleDatatype: Write the below code.

    package bootcamp11.Assignments;
    
        public class GMultipleDatatype <DatatypeOne, DatatypeTwo> {
            DatatypeOne valueOne;
            DatatypeTwo valueTwo;
    
        public GMultipleDatatype(DatatypeOne v1, DatatypeTwo v2) {
            this.valueOne = v1;
            this.valueTwo = v2;
        }
    
        public DatatypeOne getValueOne() {
            return valueOne;
        }
    
        public void setValueOne(DatatypeOne valueOne) {
            this.valueOne = valueOne;
        }
    
        public DatatypeTwo getValueTwo() {
            return valueTwo;
        }
    
        public void setValueTwo(DatatypeTwo valueTwo) {
            this.valueTwo = valueTwo();
        }

    }

Create a class named MyRunner as shown below:

    package bootcamp11.Assignments;
    
    public class myRunner {
    public static void main(String[] args) {

        // Initialize generic class with String and Integer data
        GMultipleDatatype<String, Integer> mobj = new GMultipleDatatype("Per Scholas", 11025);

        System.out.println(mobj.getValueOne());
        System.out.println(mobj.getValueTwo());

        // Initialize generic class with String and String data
        GMultipleDatatype<String, String> mobj2 = new GMultipleDatatype("Per Scholas", "Non profit");

        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());
        }
    }

### Submission Instructions
Include the following deliverables in your submission -
* Submit your source code using the Start Assignment button in the top-right corner of the assignment page in Canvas.