package bootcamp9.Slides.assignmentEncapsulation;

//    Class Variables:     Data                     Data
//    Student ID           0001                     0002
//    First Name           Michael                  Gabriel
//    Last Name            Bairon                   Vasquez
//    Student Email        mgabriel@perscholas.org  bvasquez@perscholas.org
//    Student Phone       123-456-7890              123-456-7891

import bootcamp9.Slides.encapsulationExample.Person;

public class Student {

    private int studentId;
    private String studentFirstName;
    private String studentLstName;
    private String studentEmail;
    private String studentPhoneNumber;

    public Student(
            int id,
            String firstName,
            String lastName,
            String email,
            String phoneNumber) {          // Constructor
        this.studentId = id;
        this.studentFirstName = firstName;
        this.studentLstName = lastName;
        this.studentEmail = email;
        this.studentPhoneNumber = phoneNumber;
    }
    public int getStudentId()               { return studentId; }           // Getter for Id
    public void setStudentId(int studentId) { this.studentId = studentId;}  // Setter for Id

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLstName() {
        return studentLstName;
    }

    public void setStudentLstName(String studentLstName) {
        this.studentLstName = studentLstName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public void printStudentData() {
        System.out.println("Student Id: " + studentId);
        System.out.printf("First and Last Name: %s %s/n",  studentFirstName, studentLstName);
        System.out.printf("Contact info. Email: %s, Phone number: %s/n", studentEmail, studentPhoneNumber);
    }

    public static void main(String[] args) {
        Person michaelBairon = new Person(0001, "Michael", "Bairon", "mgabriel@perscholas.org", "123-456-7890");
        michaelBairon.printStudentData()
    }
}
//    Class Variables:     Data                     Data
//    Student ID           0001                     0002
//    First Name           Michael                  Gabriel
//    Last Name            Bairon                   Vasquez
//    Student Email        mgabriel@perscholas.org  bvasquez@perscholas.org
//    Student Phone       123-456-7890              123-456-7891
