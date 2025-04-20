package Ex16_OverloadingOverridingSuperFinal;
final class FinalClass
{
    final int var=100;
    final void m1()
    {
        System.out.println("This is m1 method..");
    }
}

/*class SubClass extends FinalClass{
    void m1() //Invalid, we cannot override final methods in the subclasses.
    {
        System.out.println("This is m1 method from sub class");
    }
}*/

public class Ex4_FinalKeywordExample {
    public static void main(String[] args) {
        FinalClass fc = new FinalClass();
       // fc.var = 200; //Invalid, we cannot change the value of final variable
        System.out.println(fc.var);
        fc.m1();
    }
}
