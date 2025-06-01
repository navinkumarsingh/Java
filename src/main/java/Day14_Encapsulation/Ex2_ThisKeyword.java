package Day14_Encapsulation;

//In this example local variable and class variable name is different.
public class Ex2_ThisKeyword {
    int x, y;

    Ex2_ThisKeyword(int a, int b) {
        x = a;
        y = b;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        Ex2_ThisKeyword th = new Ex2_ThisKeyword(100, 200);
        th.display();
    }
}
