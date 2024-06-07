# Guided LAB - 303.10.3 - Abstraction
### Lab Objective
In this lab, you will demonstrate the Java Abstraction and we will utilize the previous lab (GLAB - 303.10.2).

By the end of this lab, learners will be able to use Java Abstraction in Java applications.
#### Intro
In the previous lab (GLAB - 303.10.2), we used examples of Shapes. We created Circle, Rectangle, and Triangle objects. The Shape class can only be used as a superclass for Inheritance and Polymorphism purposes; it cannot be used for objects. The class that is not used for creating objects is known as abstract.

Using an abstract class, you can improve the Shape class that was shown in the previous lab (GLAB - 303.10.2). Since there is no meaningful concept of area for an undefined two-dimensional shape, the following version of the program declares getArea( ) as an abstract method inside the Shape class. This means that all classes derived from the Shape class must override getArea( ).

Remember that we cannot instantiate the Abstract class; so there is no need to create a Constructor in the Abstract class. We will remove the constructor from the Shape class and make a few changes in all subclasses accordingly.

Create a class named Shape. This will be an Abstract class and superclass. Write the code below

    .

Create a class named Circle. This will be a Child class

    .

Create a class named Rectangle. This will be a Child class. 

    public Rectangle(String color) { super.color = color;
    }
    public Rectangle() {
    }
    public Rectangle(String color, double width, double height) {

