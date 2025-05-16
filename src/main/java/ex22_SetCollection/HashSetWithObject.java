package ex22_SetCollection;

import java.util.HashSet;
import java.util.Iterator;

class Employee {
    int empNo;
    String empName;
    int empSal;

    Employee(int empNo, String empName, int empSal) {
        this.empNo = empNo;
        this.empName = empName;
        this.empSal = empSal;
    }
}

public class HashSetWithObject {
    public static void main(String[] args) {
        Employee emp1 = new Employee(100, "Navin", 20000);
        Employee emp2 = new Employee(101, "Ved", 25000);
        Employee emp3 = new Employee(102, "Vedika", 30000);

        HashSet<Employee> empSet = new HashSet<Employee>();
        empSet.add(emp1);
        empSet.add(emp2);
        empSet.add(emp3);

        System.out.println("Read Employee set data using for-each loop....");
        for (Employee emp : empSet) {
            System.out.println(emp.empNo + " " + emp.empName + " " + emp.empSal);
        }

        System.out.println("\nRead Employee set data using Iterator....");
        Iterator<Employee> itr = empSet.iterator();
        while (itr.hasNext()) {
            Employee emp = itr.next();
            System.out.println(emp.empNo+" "+emp.empName+ " "+emp.empSal);
        }
    }
}
