// Define the package where this class is stored
package Day21_ScannerClassAndExceptionHandling;

// Import the Scanner class from the Java utility package
import java.util.Scanner;

// Define the main class
public class Ex1_ScannerDemo {

    // Main method - execution starts here
    public static void main(String[] args) {

        // Create a Scanner object to take input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.println("Enter name:");

        // Read the name input (only first word if user enters multiple words)
        String name = sc.next(); // To read full name with spaces use: sc.nextLine();

        // Display the entered name
        System.out.println("Your name is:" + name);


        // Prompt the user to enter their gender
        System.out.println("Enter gender:");

        // Read the first character of the input string as gender
        char gender = sc.next().charAt(0);

        // Display the entered gender
        System.out.println("Gender:" + gender);


        // Prompt the user to enter their age
        System.out.println("Enter age:");

        // Read the entered age as an integer
        int age = sc.nextInt();

        // Display the entered age
        System.out.println("age is:" + age);


        // Prompt the user to enter their mobile number
        System.out.println("Enter mobile number");

        // Read the entered mobile number as a long (to handle big numbers)
        long mobileno = sc.nextLong();

        // Display the entered mobile number
        System.out.println("Mobile number:" + mobileno);


        // Prompt the user to enter the price of an item
        System.out.println("Enter price of an item:");

        // Read the entered price as a decimal value (double)
        double price = sc.nextDouble();

        // Display the entered price
        System.out.println("Price of an item is:" + price);
    }

}
