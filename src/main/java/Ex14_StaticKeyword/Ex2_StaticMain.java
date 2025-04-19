package Ex14_StaticKeyword;
import Ex14_StaticKeyword.Ex1_StaticDemo;

//accessing static and non-static methods and variables when main() in some other class
public class Ex2_StaticMain {

    public static void main(String[] args) {
        System.out.println(Ex1_StaticDemo.a);
        Ex1_StaticDemo.m1();

        Ex1_StaticDemo sd = new Ex1_StaticDemo();
        System.out.println(sd.b);
        sd.m2();
        sd.m3();
    }
}
