package Day17_OverloadingOverridingSuperFinal;
class Employee{
    String empName;
    double calculateSalary()
    {
        return 0;
    }
}


class FullTimeEmployee extends Employee{
    int deptNo;
    @Override
    double calculateSalary()
    {
        return 50000;
    }
}

class PartTimeEmployee extends Employee{
    @Override
    double calculateSalary()
    {
        return 20000;
    }
}

public class Ex1_MethodOverridingDemo {
    public static void main(String[] args) {
        FullTimeEmployee fte =new FullTimeEmployee();
        System.out.println("Full time employee salary is "+fte.calculateSalary());

        PartTimeEmployee pte =new PartTimeEmployee();
        System.out.println("Part time employee salary is "+pte.calculateSalary());

        //Run time Polymorphism
        Employee emp= new FullTimeEmployee();
        emp.empName = "JOHN";  //valid
        //emp.deptNo =101;     //invalid
        System.out.println(emp.calculateSalary()); //called from FullTimeEmployee(Child class)

        Employee emp1 = new PartTimeEmployee();
        System.out.println(emp1.calculateSalary()); //called from PartTimeEmployee(Child class)
    }
}
