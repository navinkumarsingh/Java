package Day13_Polymorphism;

//Method Overloading Concept
//Definition should be different, implementation can be same.
public class Ex1_Adder
{
    int a=10, b=20;

    void sum()                         //1
    {
        System.out.println(a+b);
    }

    void sum(int x, int y)            //2
    {
        System.out.println(x+y);
    }

    void sum(int x, double y)         //3
    {
        System.out.println(x+y);
    }

    void sum(double x,int y)          //4
    {
        System.out.println(x+y);
    }

    void sum(int a, int b, int c)      //5
    {
        System.out.println(a+b+c);
    }
}
