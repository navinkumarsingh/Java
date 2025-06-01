package Day20_Interface;

interface A
{
    void a();  //by default public and abstract
    void b();  //by default public and abstract
    void c();  //by default public and abstract
    void d();  //by default public and abstract
}


abstract class B implements A
{
    public void c() {
        System.out.println("Im c()");
    }
}

class M extends B
{
    public void a()
    {
        System.out.println("Im a()");
    }

    public void b()
    {
        System.out.println("Im b()");
    }

    public void d()
    {
        System.out.println("Im d()");
    }
}



public class Ex5_AbstractClassVsInterface {

    public static void main(String[] args) {

        A obj=new M();
        obj.a();
        obj.b();
        obj.c();
        obj.d();

    }

}

