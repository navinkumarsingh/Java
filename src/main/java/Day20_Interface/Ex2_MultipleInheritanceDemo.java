// Define the package where this class is stored
package Day20_Interface;

// Declare an interface named Animal
interface Animal
{
    // Declare an abstract method 'eat' that needs to be implemented by classes
    void eat();

    // Declare an abstract method 'dup' to demonstrate method name conflict with another interface
    void dup();
}

// Declare another interface named Bird
interface Bird
{
    // Declare an abstract method 'fly'
    void fly();

    // Another 'dup' method to show method name conflict with Animal interface
    void dup();
}

// Define a class that implements both Animal and Bird interfaces
public class Ex2_MultipleInheritanceDemo implements Animal, Bird
{
    // Provide implementation for 'eat' method from Animal interface
    public void eat()
    {
        // Print a message when eating
        System.out.println("Eating.....");
    }

    // Provide implementation for 'fly' method from Bird interface
    public void fly()
    {
        // Print a message when flying
        System.out.println("Flying....");
    }

    // Implement the 'dup' method that exists in both interfaces
    // Only one implementation is needed as method signatures are the same
    public void dup() {
        // Print a message showing this is a duplicate method implementation
        System.out.println("Duplicate method from parent interfaces...");
    }

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Create an object of Ex2_MultipleInheritanceDemo
        Ex2_MultipleInheritanceDemo obj = new Ex2_MultipleInheritanceDemo();

        // Call the eat() method
        obj.eat();

        // Call the fly() method
        obj.fly();

        // Call the dup() method
        obj.dup();
    }
}
