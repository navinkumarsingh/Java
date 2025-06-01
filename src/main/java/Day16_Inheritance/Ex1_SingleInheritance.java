package Day16_Inheritance;

//Parent Class
class Vehicle
{
    String brand = "Hyundai";
    void start()
    {
        System.out.println("Vehicle is starting...");
    }
}

//Child Class
class Car extends Vehicle
{
    String model = "i10";
    void display()
    {
        System.out.println("model:"+model);
        System.out.println("brand:"+brand);
    }
}

public class Ex1_SingleInheritance {
    public static void main(String[] args) {

        //Case 1
        Vehicle v = new Vehicle();
        System.out.println(v.brand);
        v.start();

        //case 2
        Car c = new Car();
        System.out.println(c.brand);
        c.start();

        System.out.println(c.model);
        c.display();

        //Case 3 : Up casting
        Vehicle var = new Car();               //Parent class variable can hold child class Object
        System.out.println(var.brand);
        var.start();

        //System.out.println(var.model); //We cannot access
        //var.display() //We cannot access

        //Case 4 : //java.lang.ClassCastException : throws runtime //Down casting
        Car car =(Car) new Vehicle();         //Child class variable is holding Parent class object
                                              //Type casting in needed

        System.out.println(car.brand);
        car.start();
        System.out.println(car.brand);
        car.display();

    }
}
