package ex8_ClassAndObject;

public class Student {
    int sid;
    /*If all the value are common across all the Object. We can assign the variable value in class level. Else we
    should assign their value to every Object only.*/
    //String sname="Smith";
    String sname;
    char grad;

    void printData()
    {
        System.out.println(sid+"  "+sname+"  "+grad);
    }
}
