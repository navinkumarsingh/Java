package ex8_ClassAndObject;

public class Ex3_StudentMain {
    public static void main(String[] args) {
        Ex3_Student stu1=new Ex3_Student();
        stu1.sid=101;
        stu1.sname="smith";
        stu1.grad='A';
        stu1.printData();

        Ex3_Student stu2= new Ex3_Student();
        stu2.sid=102;
        stu2.sname="John";
        stu2.grad='A';
        stu2.printData();
    }
}
