package bootcamp9.Assignments.PA303_9.hackerrankJavaInheritanceI;

public class Animal {
    void walk()
    {
        System.out.println("I am walking");
    }
}
class Bird extends Animal
{
    void fly()
    {
        System.out.println("I am flying");
    }
    void sing()
    {
        System.out.println("I am singing");
    }
}

