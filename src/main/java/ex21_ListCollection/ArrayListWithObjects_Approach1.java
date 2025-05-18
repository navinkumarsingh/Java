// Declaring the package where this file is stored
package ex21_ListCollection;

// Importing required classes from Java utility package
import java.util.ArrayList;   // ArrayList is used to store dynamic list of elements
import java.util.Iterator;    // Iterator is used to iterate through a collection like ArrayList

// Defining a custom class 'Student' to represent student details
class Student {
    int rollno;   // Variable to store student roll number
    String name;  // Variable to store student name
    int age;      // Variable to store student age

    // Constructor to initialize student object with roll number, name, and age
    Student(int rollno, String name, int age) {
        this.rollno = rollno;   // Assign the passed roll number to this object's rollno
        this.name = name;       // Assign the passed name to this object's name
        this.age = age;         // Assign the passed age to this object's age
    }
}

// Main class containing the main() method
public class ArrayListWithObjects_Approach1 {

    // Entry point of the program
    public static void main(String[] args) {

        // Creating 3 Student objects with specific values
        Student std1 = new Student(101, "Ved", 21);        // Student 1
        Student std2 = new Student(102, "Vedika", 22);     // Student 2
        Student std3 = new Student(103, "Navin", 23);      // Student 3

        // Creating an ArrayList to store Student objects
        ArrayList<Student> studentList = new ArrayList<Student>();

        // Adding student objects to the ArrayList
        studentList.add(std1);   // Adding Student 1
        studentList.add(std2);   // Adding Student 2
        studentList.add(std3);   // Adding Student 3

        // Reading and printing student data using for-each loop
        System.out.println("Student list using for each loop....");
        for (Student student : studentList) {  // Loop through each Student object in the list
            // Print student details
            System.out.println(student.rollno + " " + student.name + " " + student.age);
        }

        // Reading and printing student data using Iterator
        System.out.println("\nStudent list using iterator....");
        Iterator<Student> itr = studentList.iterator();  // Creating iterator for studentList

        // Loop through list until no more elements are available
        while (itr.hasNext()) {
            Student st = itr.next();   // Get the next Student object
            // Print student details
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
