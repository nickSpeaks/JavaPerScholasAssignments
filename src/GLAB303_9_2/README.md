# Guided LAB - 303.9.2 - Basic Inheritance Example

The process by which one class acquires the properties (data members) and functionalities (methods) of another class is called inheritance. The aim of inheritance is to provide the reusability of code so that a class has to write only the unique features, and the rest of the common properties and functionalities can be extended from the other class.

## Child Class
The class that extends the features of another class is known as a child class, subclass, or derived class.
## Parent Class
The class whose properties and functionalities are used (inherited) by another class is known as the parent class, superclass, or base class.
## Doctor is a Surgeon
In this lab, we have a base class, “Doctor,” and a subclass, “Surgeon.”
### Step 1. 
Create a Java project named “inheritanceDemo.”
### Step 2. 
Create a class named Doctor, and add the code below.

    package bootcamp9.Assignments.GLAB303_9_2;

    public class Doctor {
        String DoctorName;
        String Department;
        public void Doctor_Details() {
        System.out.println("Doctor Details...");
        }
    }

### Step 3. Create a class named Surgeon, and add the code below

    package bootcamp9.Assignments.GLAB303_9_2;

    public class Surgeon extends Doctor {
        void Surgeon_Details() {
        System.out.println("Surgeon Detail ...");
        System.out.println(Department = "Cardio");
        }
    }

### Step 4. 
Create a class named Hospital. In this class, we will create a main() method

    package bootcamp9.Assignments.GLAB303_9_2.inheritanceDemo;

    public class Hospital {
    public static void main(String args[]) {
        Surgeon s = new Surgeon();
        s.Doctor_Details();
        s.Surgeon_Details();
        }
    }
    
OUTPUT

    //Doctor Details...
    //Surgeon Detail ...
    //Cardio

The project hierarchy will look like this:

    - inheritanceDemo
        - idea
        - out
        - src
                - Doctor (private)
                - Hospital (private)
                - Surgeon
                - inheritanceDemo.iml
        - External Libraries
        - Scratches and Consoles

## Summary
Based on the above example, we can say that Surgeon IS-A Child. This means a child class has an IS-A relationship with the parent class. This inheritance is known as the IS-A relationship between the child and parent class.
