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
