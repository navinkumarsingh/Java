package ex6_Arrays;

public class Ex6_ObjectArray {
    public static void main(String[] args) {

        Object a[] = {100,10.5,'A',"WELCOME",true};
        //read the data using Enhanced for loop
/*

        for(Object x:a)
        {
        System.out.println(x);
        }
*/

        //read the data using normal for loop
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
