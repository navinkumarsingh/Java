package ex19_Interface;

interface Animal
{
    void eat();

    void dup();
}


interface Bird
{
    void fly();
    void dup();
}




public class Ex2_MultipleInheritanceDemo implements Animal,Bird
{

    public void eat()
    {
        System.out.println("Eating.....");
    }

    public void fly()
    {
        System.out.println("Flying....");
    }

    public void dup() {
        System.out.println("Duplicate method from parent interfaces...");
    }


    public static void main(String[] args) {

        Ex2_MultipleInheritanceDemo obj=new Ex2_MultipleInheritanceDemo();
        obj.eat();
        obj.fly();
        obj.dup();
    }

}

