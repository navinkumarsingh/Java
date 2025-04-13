package ex12_Polymorphism;

public class Ex2_BoxMain {
    public static void main(String[] args) {
        Ex2_Box b1 = new Ex2_Box();             //1 - Invoke first constructor
        System.out.println(b1.volume());

        Ex2_Box b2 = new Ex2_Box(105,15.5,5.0);   //2 - Invoke second constructor
        System.out.println(b2.volume());
    }
}
