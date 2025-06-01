package Day12_MethodAndConstructor;
public class Student {
    //class variables : Inside class accessible to any methods
    int sid;
    String sname;
    char grad;

    void printStudentData()
    {
        System.out.println(sid+"  "+sname+"  "+grad);
    }

    void setStudentData(int id, String name, char gr)//local variables/method specific variable: accessed within this method
    {
        sid = id;
        sname = name;
        grad =gr;
    }

    Student(int id,String name,char gr)
    {
        sid = id;
        sname=name;
        grad=gr;

    }
}
