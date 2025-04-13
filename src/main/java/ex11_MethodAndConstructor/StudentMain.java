package ex11_MethodAndConstructor;

//3 Approaches by which we can store value to the variable
public class StudentMain {
    public static void main(String[] args) {
        //Student st = new Student();

        //1)Using Object reference variable
       /* st.sid = 101;
        st.sname= "John";
        st.grad = 'A';*/

       //2)Using method
       // st.setStudentData(102,"Smith",'B');
        // st.printStudentData();

        //3)Using 2_Constructor
        Student stu = new Student(101,"John",'A');
        stu.printStudentData();
    }
}
