// Define the package where this class is stored
package ex19_Interface;

// Define an interface named Vehicle
interface Vehicle
{
    // Declare a constant for maximum speed
    int max_speed = 120; // final & Static

    // Declare a constant for minimum speed
    int min_speed = 10;   //final static

    // Declare an abstract method that must be implemented by classes
    void start(); // abstract method. No need to specify abstract keyword, public modifier is associated

    // Define a default method with implementation, available since Java 8
    default void drive()  // Default method ( supported from java8)
    {
        // This method prints a message when called
        System.out.println("Driving safely...");
    }

    // Define a static method that belongs to the interface, not to any object
    static void showMaxSpeed()   // Static method (supported from java 8)
    {
        // Print the maximum speed constant
        System.out.println("Maximum speed is:" + max_speed);
    }

    // Define a private method that can only be used inside the interface
    private void showMinSpeed()  // Private method (supported from java 9)
    {
        // Print the minimum speed constant
        System.out.println("Minimum speed is:" + min_speed);
    }

    // A default method that calls both max and min speed display methods
    default void showSpeeds()
    {
        // Call static method inside the interface
        showMaxSpeed();

        // Call private method inside the interface
        showMinSpeed();
    }
}

// Define a class Car that implements the Vehicle interface
class Car implements Vehicle
{
    // Provide implementation for the abstract method 'start'
    @Override
    public void start()
    {
        // Print a message indicating the car is starting
        System.out.println("Car is starting....");
    }
}

// Define the main class with the main method to run the program
public class Ex1_InterfaceDemo {

    // Main method - execution starts here
    public static void main(String[] args) {

        // Create a Vehicle reference and assign it to a Car object
        Vehicle v = new Car();

        // Call the implemented start method
        v.start();

        // Call the default method 'drive'
        v.drive();

        // Call the static method directly through the interface name
        Vehicle.showMaxSpeed();  // static method directly called through Interface

        //v.showMinSpeed(); // cannot access since it is private method

        // Call the default method that internally calls both speed methods
        v.showSpeeds();
    }

}
