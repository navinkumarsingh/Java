package Day20_Interface;

interface I1
{
    void m1();
}

interface I2
{
    void m2();
}

class C
{
    void c1()
    {
        System.out.println("This is C1() from C class...");
    }
}



public class Ex3_HybridInheritanceDemo extends C implements I1,I2
{
    public void m1()
    {
        System.out.println("This m1() from I1 interface...");
    }


    public void m2()
    {
        System.out.println("This is m2() from I2 interface...");
    }

    public static void main(String[] args) {

        Ex3_HybridInheritanceDemo obj=new Ex3_HybridInheritanceDemo();
        obj.c1();
        obj.m1();
        obj.m2();

    }

}
