package Day14_Encapsulation;

//In this example class variable and local variable name is same
public class Ex3_ThisKeyword {
    int x,y;

    Ex3_ThisKeyword(int x,int y)
    {
        //If we keep x=x and y=y. Compiler will get confuse and default value for integer will be printed.i.e. 0,0
        x=x;
        y=y;

        //We can assign using this keyword.
       // this.x = x;
       // this.y=y;

    }

    void display()
    {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        Ex3_ThisKeyword th = new Ex3_ThisKeyword(100,200);
        th.display();
    }
}
