# PA 303.9.1 - Practice Assignment - Inheritance and overloading

## Objective:
This practice assignment will test your knowledge and understanding of Java Inheritance and Overloading.
## Instructions:
This assessment will be administered through HackerRank. Please complete the following Java assignments by opening the links below.

Note: Invitation is not required.

### Java Inheritance I.
#### Problem
https://www.hackerrank.com/challenges/java-inheritance-1/problem

Using inheritance, one class can acquire the properties of others. Consider the following Animal class:

        class Animal{
            void walk(){
                System.out.println("I am walking");
            }
        }

This class has only one method, walk. Next, we want to create a Bird class that also has a fly method. We do this using extends keyword:

        class Bird extends Animal {
            void fly() {
                System.out.println("I am flying");
            }
        }

Finally, we can create a Bird object that can both fly and walk.

        public class Solution{
        public static void main(String[] args){

          Bird bird = new Bird();
          bird.walk();
          bird.fly();
            }
        }

The above code will print:

        I am walking
        I am flying

This means that a Bird object has all the properties that an Animal object has, as well as some additional unique properties.

The code above is provided for you in your editor. You must add a sing method to the Bird class, then modify the main method accordingly so that the code prints the following lines:

        I am walking
        I am flying
        I am singing

#### Solution

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

let's compile

        package bootcamp9.Assignments.PA303_9.hackerrankJavaInheritanceI;
        
        public class Solution {
        public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
        }
        }
OUTPUT

        //    I am walking
        //    I am flying
        //    I am singing

### Java Inheritance II.
https://www.hackerrank.com/challenges/java-inheritance-2/problem

#### Problem

Write the following code in your editor below:
1. A class named Arithmetic with a method named add that takes  integers as parameters and returns an integer denoting their sum.
2. A class named Adder that inherits from a superclass named Arithmetic.

3. Your classes should not be public.

Input Format

You are not responsible for reading any input from stdin; a locked code stub will test your submission by calling the add method on an Adder object and passing it  integer parameters.

Output Format

You are not responsible for printing anything to stdout. Your add method must return the sum of its parameters.

Sample Output

The main method in the Solution class above should print the following:

        My superclass is: Arithmetic
        42 13 20

#### Solution

        package bootcamp9.Assignments.PA303_9.hackerrankJavaInheritanceII;
        
        //Write your code here
        class Arithmetic {
            int add(int one, int two) {
            return one + two;
            }
        }
        
        class Adder extends Arithmetic {
        
        }
        
            public class Solution{
            public static void main(String []args){
                // Create a new Adder object
                Adder a = new Adder();
    
            // Print the name of the superclass on a new line
            System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
    
            // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
            System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
            }
        }

OUTPUT

        My superclass is: Arithmetic
        42 13 20

### Java Method Overriding.

#### Problem
https://www.hackerrank.com/challenges/java-method-overriding/problem

When a subclass inherits from a superclass, it also inherits its methods; however, it can also override the superclass methods (as well as declare and implement new ones). Consider the following Sports class:

    class Sports{
    String getName(){
    return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
    System.out.println( "Each team has n players in " + getName() );
    }
    }

Next, we create a Soccer class that inherits from the Sports class. We can override the getName method and return a different, subclass-specific string:

    class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
        }
    }

Note: When overriding a method, you should precede it with the @Override annotation. The parameter(s) and return type of an overridden method must be exactly the same as those of the method inherited from the supertype.

Task
Complete the code in your editor by writing an overridden getNumberOfTeamMembers method that prints the same statement as the superclass' getNumberOfTeamMembers method, except that it replaces  with  (the number of players on a Soccer team).

Output Format

When executed, your completed code should print the following:

    Generic Sports
    Each team has n players in Generic Sports
    Soccer Class
    Each team has 11 players in Soccer Class

Given code:

    import java.util.*;
    class Sports{

    String getName(){
        return "Generic Sports";
    }
  
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
        }
    }
    
    class Soccer extends Sports{
    @Override
    String getName(){
    return "Soccer Class";
    }

    // Write your overridden getNumberOfTeamMembers method here

    }
    
    public class Solution{

    public static void main(String []args){
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
        }
    }

#### Solution

    package bootcamp9.Assignments.PA303_9.hackerrankJavaMethodOverriding;
    
    import java.util.*;
    class Sports{

    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
    }
    
    class Soccer extends Sports{
    @Override
    String getName(){
    return "Soccer Class";
    }

    // Write your overridden getNumberOfTeamMembers method here
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
        }
    }
    
    public class Solution{

    public static void main(String []args){
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
        }
    }

### Java Method Overriding 2 (Super Keyword).
https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem

#### Problem

When a method in a subclass overrides a method in superclass, it is still possible to call the overridden method using super keyword. If you write super.func() to call the function func(), it will call the method that was defined in the superclass.

You are given a partially completed code in the editor. Modify the code so that the code prints the following text:

    Hello I am a motorcycle, I am a cycle with an engine.
    My ancestor is a cycle who is a vehicle with pedals.

#### Solution

    package bootcamp9.Assignments.PA303_9.hackerrankJavaMethodOverriding2SuperKeyword;
    
    import java.util.*;
    import java.io.*;
    
    
    class BiCycle{
        String define_me(){
        return "a vehicle with pedals.";
        }
    }
    
    class MotorCycle extends BiCycle{
        String define_me(){
        return "a cycle with an engine.";
    }

    MotorCycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define_me());

        String temp=super.define_me(); //Fix this line

        System.out.println("My ancestor is a cycle who is "+ temp );
    }
    
    }
    class Solution{
    public static void main(String []args){
        MotorCycle M=new MotorCycle();
        }
    }
