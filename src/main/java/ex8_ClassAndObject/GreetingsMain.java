package ex8_ClassAndObject;

public class GreetingsMain {
    public static void main(String[] args) {
        Greetings gr = new Greetings();
        gr.m1();  //1) No Params, No return value

        String s = gr.m2(); //2) No param, return value
        System.out.println(s);

        gr.m3("John"); //3)Takes Param, No return value

        String name = gr.m4("David"); //Takes param, return value
        System.out.println(name);
    }
}
