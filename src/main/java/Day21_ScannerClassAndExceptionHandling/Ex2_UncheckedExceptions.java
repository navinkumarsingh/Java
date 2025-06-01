// Define the package where this class is stored
package Day21_ScannerClassAndExceptionHandling;

// Import the Scanner class to take user input from the console
import java.util.Scanner;

// Define the main class
public class Ex2_UncheckedExceptions {

    // Main method - execution starts here
    public static void main(String[] args) {

        // Print a message indicating the program has started
        System.out.println("Program is started...");

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // --------- Example 1: ArithmeticException ---------
        // Prompt the user to enter a number
        System.out.println("Enter a number:");

        // Read the input number from the user
        int num = sc.nextInt();

        // Use try-catch to handle division by zero exception
        try {
            // Try dividing 100 by the entered number
            int result = 100 / num;

            // Print the result of the division
            System.out.println("Result is:" + result);
        } catch (ArithmeticException e) {
            // Handle case when user enters 0 (division by zero)
            System.out.println("Invalid input");
        }

        // --------- Example 2: NumberFormatException ---------
        // Ask the user to enter a string
        System.out.println("Enter a String:");

        // Read the input string
        String str = sc.next();

        // Use try-catch to handle invalid number conversion
        try {
            // Try converting the string to an integer
            int valueInt = Integer.parseInt(str);

            // Print the converted integer value
            System.out.println(valueInt);
        } catch (NumberFormatException e) {
            // Handle case when the input string is not a valid number
            System.out.println("Invalid input");
        }

        // --------- Example 3: NullPointerException ---------
        // Initialize a normal string
        String s1 = "Welcome";

        // Initialize an empty string
        String s2 = "";

        // Initialize a null string
        String s3 = null;

        // Print the length of the first string
        System.out.println(s1.length());

        // Print the length of the empty string (will print 0)
        System.out.println(s2.length());

        // Use try-catch to handle null pointer exception
        try {
            // Try accessing the length of a null string (will throw exception)
            System.out.println(s3.length());
        } catch (NullPointerException e) {
            // Handle case where object is null
            System.out.println("Invalid input");
        }

        // --------- Example 4: ArrayIndexOutOfBoundsException ---------
        // Declare and initialize an array with 4 elements
        int[] a = {12, 13, 14, 15};

        // Access and print the first element of the array
        System.out.println(a[0]);

        // Access and print the fourth element (index 3)
        System.out.println(a[3]);

        // Use try-catch to handle index out of bounds
        try {
            // Try accessing the fifth element (index 4), which doesn't exist
            System.out.println(a[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle case when index is out of range
            System.out.println("Invalid input");
        }

        // Print a message indicating the program is still running
        System.out.println("Program is executing...");

        // Print a message indicating the program has finished
        System.out.println("Program is finished...");

        // Close the Scanner object to release system resources
        sc.close();
    }
}
