package Ex16_;

class ABC{
    void m1(int a)
    {
        System.out.println(a);
    }

    void m2(int b)
    {
        System.out.println(b);
    }
}

class XYZ extends ABC{
    void m1(int a)                           //overrided method
    {
        System.out.println(a*a);
    }
    void m2(int b)                           //overrided method
    {
        System.out.println(b);
    }

    void m2(int a, int b)                     //overloaded method
    {
        System.out.println(a+b);
    }
}
public class Ex2__OverridingVsOverridingInMultipleClass {
    public static void main(String[] args) {

        XYZ xyzobj = new XYZ();
        xyzobj.m1(10);          //called m1() from XYZ
        xyzobj.m2(5);           //called m2() from XYZ
        xyzobj.m2(5,15);     //called m2() from XYZ

    }
}
