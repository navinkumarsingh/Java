package Day12_MethodAndConstructor;

public class ConstructorDemo {
    int x, y;

    ConstructorDemo()//Default Constructor
    {
        //constructor is used to store value to the variable
        x = 100;
        y = 200;
    }

    /*ConstructorDemo(int a, int b)  //Parameterized Constructor
    {
        x = a;
        y = b;
    }*/

    ConstructorDemo(int x, int y)  //Parameterized Constructor
    {
        this.x = x;
        this.y = y;
    }

    void sum() {
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        ConstructorDemo cd1 = new ConstructorDemo(); //invoke default constructor
        cd1.sum();
        ConstructorDemo cd2 = new ConstructorDemo(2, 3); //parameterized constructor
        cd2.sum();
    }
}
