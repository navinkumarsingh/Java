package Day15_StaticKeyword;

//accessing static and non-static methods and variables when main() inside the same class
public class Ex1_StaticDemo {
    static int a=10; //static variable
    int b=20;  //non-static variable

    static void m1() //static method
    {
        System.out.println("This is m1 static method");
    }

    void m2() //non-static method
    {
        System.out.println("This is m2 non-static method");
    }

    void m3() //non-static method
    {
        System.out.println(a); //static
        System.out.println(b); //non-static
        m1(); //static
        m2(); //non-static
    }

  /*  public static void main(String[] args) {
        //1. Static methods can access static stuff directly.
        System.out.println(a);
        //System.out.println(b); //invalid. Because b is non-static

        m1();
        //m2(), //invalid. Because m2() is non-static method.

        //Static methods can access Non-static stuff through an Object.
        Ex1_StaticDemo sd = new Ex1_StaticDemo();
        System.out.println(sd.b);
        sd.m2();
    }
*/

}
