package ex19_Interface;

interface Int1
{
    void m1();
}

interface Int2
{
    void m2();
}


interface CombinedInt extends Int1,Int2
{
}



class Cls
{
    void c1()
    {
        System.out.println("This is C1() from C class...");
    }
}



public class Ex4_HybridInheritanceDemo2 extends Cls implements CombinedInt
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

        Ex4_HybridInheritanceDemo2 obj=new Ex4_HybridInheritanceDemo2();
        obj.c1();
        obj.m1();
        obj.m2();

    }

}
