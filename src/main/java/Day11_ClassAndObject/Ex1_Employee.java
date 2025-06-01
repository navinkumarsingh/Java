package Day11_ClassAndObject; // This defines the package name. A package is used to group related classes.

//main() is in same class
// This is a class named 'Employee'. A class is a blueprint for creating objects.
public class Ex1_Employee {

    // These are class-level variables (also known as instance variables or data members).
    // Each object of the Employee class will have its own copy of these variables.
  public   int empId;       // To store the employee ID
  public   String empName;  // To store the employee's name
  public   String job;      // To store the employee's job title
  public   int sal;         // To store the employee's salary

    // This is a method called 'display'. It prints the employee details to the console.
  public  void display() {
        // Print the employee details
        System.out.println(empId);
        System.out.println(empName);
        System.out.println(job);
        System.out.println(sal);
    }


    // This is the main method. The execution of any Java program starts from the main method.
    public static void main(String[] args) {

        // Creating the first object (emp1) of the Employee class using the 'new' keyword
        Ex1_Employee emp1 = new Ex1_Employee();

        // Setting values to the variables of emp1
        emp1.empId = 101;            // Assign ID to emp1
        emp1.empName = "Navin";      // Assign name to emp1
        emp1.job = "SDET2";          // Assign job title to emp1
        emp1.sal = 50000;            // Assign salary to emp1

        // Calling the display method to print emp1's details
        emp1.display();



        // Creating the second object (emp2) of the Employee class
        Ex1_Employee emp2 = new Ex1_Employee();

        // Setting values to the variables of emp2
        emp2.empId = 102;            // Assign ID to emp2
        emp2.empName = "Bikash";     // Assign name to emp2
        emp2.job = "SDE2";           // Assign job title to emp2
        emp2.sal = 60000;            // Assign salary to emp2

        // Calling the display method to print emp2's details
        emp2.display();
    }
}

/*
Summary of Concepts:
Class: A blueprint/template to create objects. In this case, Employee is the class.

Object: An instance of a class. Here, emp1 and emp2 are objects.

Instance Variables: Variables declared in the class to store object-specific data.

1_Methods: Functions inside a class. The display() method shows employee details.

Main Method: The entry point of any Java program where execution begins.
*/