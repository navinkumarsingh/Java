package Day17_OverloadingOverridingSuperFinal;

//Super can be used to refer immediate parent class variable.
//Super can be used to refer immediate parent class method.
//Super can be used to refer immediate parent class Constructor.

class Parent{
    int num=10;
    void display()
    {
        System.out.println("This is Display() from Parent class..");
    }
    Parent()
    {
        System.out.println("Parent class Constructor");
    }
}

class Child extends Parent
{
    int num=20;
    void show()
    {
     //System.out.println("Child class variable is being called"+num);

     System.out.println("Immediate Parent class variable is being called "+super.num);
    }

    void display()
    {
        //System.out.println("This is Display() from Child class..");
        super.display();
    }

    Child()
    {
       // System.out.println("Child class Constructor");
        super(); //This will call Parent class constructor
    }
}

public class Ex3_SuperKeywordExample {
    public static void main(String[] args) {
        Child ch=new Child();
        ch.show();
        ch.display();

    }
}
