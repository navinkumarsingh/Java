package ex12_Polymorphism;

public class Ex1_AdderMain
{
    public static void main(String[] args)
    {
        Ex1_Adder ad = new Ex1_Adder();
        ad.sum();                          //1
        ad.sum(100,200);             //2
        ad.sum(10.5,20);             //4
        ad.sum(20,15.5);             //3
        ad.sum(10,20,30);         //5
       // ad.sum(10.5,20.5,15.0);          //invalid:  Because this definition is not available in Ex1_Adder class
    }
}
