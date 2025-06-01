package Day19_AccessModifierAndDataAbstraction;

abstract class Bike {
    void start() { //Non-abstract method/normal/default
        System.out.println("Starting the Bike");
    }

    abstract void drive(); //abstract method(no implementation)

    static void park() {   //directly access through class Name
        System.out.println("Parking the Bike");
    }

    final void stop() {    //final method, cannot override in child class
        System.out.println("Stopping the Bike");
    }

}

class Honda extends Bike {
    @Override
        //It means this method is overridden in child class. It's optional we can use @Override or we can remove
    void drive() {
        System.out.println("Driving the Bike");
    }
}

public class Ex1_AbstractionDemo {
    public static void main(String[] args) {
        //Bike b = new Bike(); //Invalid. Bike is abstract class. We cannot create object

        Honda h = new Honda(); //Valid but we cannot achieve data abstraction
        h.start();             //normal
        h.drive();             //abstract
        Bike.park();           //static
        h.stop();              //final


        //With below approach we can achieve Abstraction. When we want to access drive(), will redirect to parent drive()
        Bike b = new Honda();  //valid
        b.start();             //normal
        b.drive();             //abstract
        Bike.park();           //static
        b.stop();              //final
    }
}
