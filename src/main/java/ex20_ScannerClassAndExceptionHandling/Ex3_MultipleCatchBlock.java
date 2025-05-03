// Define the package where this class is located
package ex20_ScannerClassAndExceptionHandling;

// Define the main class
public class Ex3_MultipleCatchBlock {

    // Main method - program execution starts here
    public static void main(String[] args) {

        // --------- Approach 1: Using Multiple Catch Blocks ---------
        try {
            // Declare and initialize an array with 4 elements (indices 0 to 3)
            int[] a = {10, 11, 12, 13};

            // Try to access index 5, which doesn't exist (will throw ArrayIndexOutOfBoundsException)
            System.out.println(a[5]);

            // This line will not execute because the above line causes an exception
            int result = 100 / 0; // Would throw ArithmeticException if reached
        }
        // This block will execute if an ArithmeticException occurs
        catch (ArithmeticException e) {
            System.out.println("Handled Arithmetic exception....");
        }
        // This block will execute if an ArrayIndexOutOfBoundsException occurs
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException....");
        }

        // --------- Approach 2: Using a Single Catch Block for All Exceptions ---------
        // Declare and initialize another array
        int[] a = {10, 11, 12, 13};

        // Use try-catch to handle all exceptions with a general Exception block
        try {
            // Try to access an out-of-range index (will throw exception)
            System.out.println(a[5]);

            // This line won’t be executed due to the exception above
            int result = 100 / 0;
        }
        // Catch any exception using the parent Exception class
        catch (Exception e) {
            System.out.println("Handled exception....");

            // Print the actual exception details to the console (for debugging)
            // System.out.println(e.getMessage()); // (optional) prints just the error message
            e.printStackTrace(); // Prints full stack trace of the error
        }
    }
}
