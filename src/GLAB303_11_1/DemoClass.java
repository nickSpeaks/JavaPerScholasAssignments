package bootcamp11.Assignments.GLAB303_11_1;

public class DemoClass {

    // create a generic method
    public <T> void genericMethod(T data) {
        System.out.println("Generic Method:");
        System.out.println("Data passed: " + data);
    }
}
