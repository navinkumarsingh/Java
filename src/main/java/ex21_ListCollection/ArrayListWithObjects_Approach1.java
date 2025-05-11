package ex21_ListCollection;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;


    }
}

public class ArrayListWithObjects_Approach1 {
    public static void main(String[] args) {
        Student std1 = new Student(101, "Ved", 21);
        Student std2 = new Student(102, "Vedika", 22);
        Student std3 = new Student(103, "Navin", 23);

        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(std1);
        studentList.add(std2);
        studentList.add(std3);

        //Read object data using for each loop...
        System.out.println("Student list using for each loop....");
        for (Student student : studentList) {
            System.out.println(student.rollno + " " + student.name + " " + student.age);
        }

        //Read Object data using iterator
        System.out.println("\nStudent list using iterator....");
        Iterator<Student> itr = studentList.iterator();
        //Iterator itr = studentList.iterator();
        while (itr.hasNext()) {
            Student st = itr.next();
            // Student st = (student)itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
