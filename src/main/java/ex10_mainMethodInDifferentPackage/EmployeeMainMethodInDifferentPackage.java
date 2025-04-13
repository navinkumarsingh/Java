package ex10_mainMethodInDifferentPackage;
import ex8_ClassAndObject.Employee;

public class EmployeeMainMethodInDifferentPackage {
        public static void main(String[] args) {
            // Creating the first object (emp1) of the Employee class using the 'new' keyword
            Employee emp1 = new Employee();

            // Setting values to the variables of emp1
            emp1.empId = 101;            // Assign ID to emp1
            emp1.empName = "Navin";      // Assign name to emp1
            emp1.job = "SDET2";          // Assign job title to emp1
            emp1.sal = 50000;            // Assign salary to emp1

            // Calling the display method to print emp1's details
            emp1.display();



            // Creating the second object (emp2) of the Employee class
            Employee emp2 = new Employee();

            // Setting values to the variables of emp2
            emp2.empId = 102;            // Assign ID to emp2
            emp2.empName = "Bikash";     // Assign name to emp2
            emp2.job = "SDE2";           // Assign job title to emp2
            emp2.sal = 60000;            // Assign salary to emp2

            // Calling the display method to print emp2's details
            emp2.display();
        }
    }

