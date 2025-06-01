// Declaring the package this file belongs to
package Day23_SetCollection;

// Importing required classes
import java.util.HashSet;    // For creating HashSet
import java.util.Iterator;   // For iterating over the HashSet

// Creating a class to represent an Employee
class Employee {
    int empNo;       // Employee number (ID)
    String empName;  // Employee name
    int empSal;      // Employee salary

    // Constructor to initialize employee object with id, name, and salary
    Employee(int empNo, String empName, int empSal) {
        this.empNo = empNo;         // Assigning passed empNo to current object
        this.empName = empName;     // Assigning passed empName to current object
        this.empSal = empSal;       // Assigning passed empSal to current object
    }
}

// Main class containing the main method
public class HashSetWithObject {

    // Entry point of the Java program
    public static void main(String[] args) {

        // Creating Employee objects and initializing them
        Employee emp1 = new Employee(100, "Navin", 20000);     // Employee 1
        Employee emp2 = new Employee(101, "Ved", 25000);       // Employee 2
        Employee emp3 = new Employee(102, "Vedika", 30000);    // Employee 3

        // Creating a HashSet to store Employee objects
        // HashSet ensures no duplicates (based on object reference unless equals/hashCode overridden)
        HashSet<Employee> empSet = new HashSet<Employee>();

        // Adding employee objects to the HashSet
        empSet.add(emp1);   // Adding Employee 1
        empSet.add(emp2);   // Adding Employee 2
        empSet.add(emp3);   // Adding Employee 3

        // Reading data from HashSet using for-each loop
        System.out.println("Read Employee set data using for-each loop....");
        for (Employee emp : empSet) {   // Looping through each employee in the HashSet
            // Printing employee details (ID, Name, Salary)
            System.out.println(emp.empNo + " " + emp.empName + " " + emp.empSal);
        }

        // Reading data from HashSet using Iterator
        System.out.println("\nRead Employee set data using Iterator....");
        Iterator<Employee> itr = empSet.iterator();  // Creating iterator to loop through HashSet
        while (itr.hasNext()) {                      // Loop until no more elements
            Employee emp = itr.next();               // Get the next employee
            // Printing employee details (ID, Name, Salary)
            System.out.println(emp.empNo + " " + emp.empName + " " + emp.empSal);
        }
    }
}

