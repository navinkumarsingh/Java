package ex17_Casting;

    //Parent
    class Vehicle
    {
        String brand="Hyundai";

        void start()
        {
            System.out.println("Vehicle is starting...");
        }

        void run()
        {
            System.out.println("Vehicle is running...");
        }
    }


    class Car extends Vehicle
    {
        String model="i20";

        void stop()
        {
            System.out.println("Car is stopping...");
        }

        void run()
        {
            System.out.println("Car is running...");
        }
    }


    public class Ex1_Casting {

        public static void main(String[] args) {

            //Upcasting - possible directly/ implicit

		/*Vehicle p=new Car(); //Parent class reference can hold child class object
		System.out.println(p.brand);

		p.start();
		p.run(); //Override method can access from Child class Bcoz object is created for Child class
		*/

            //Down casting - indirect/ explicit

            //Car c=new Vehicle();  //invalid

            //Car c=(Car) new Vehicle(); //java.lang.ClassCastException
            //invalid

            //Valid
            Vehicle v = new Car();
            Car c = (Car) v;
            System.out.println(c.brand);
            System.out.println(c.model);
            c.start();
            c.run();
            c.stop();
        }

    }

