package ex8_ClassAndObject;

public class Greetings
{
    //1) No params     No return value

    void m1()
    {
        System.out.println("Hello");
    }

    //2) No params    Returns value
    String m2()
    {
        return "Hello how are you";
    }

//3)Takes param, no return value
    void m3(String name)
    {
        System.out.println("Hello "+name);

    }

    //Takes param, returns value
    String m4(String name)
    {
        return("Hello "+name);
    }






}
