// Define the package where this class is located
package Day21_ScannerClassAndExceptionHandling;

// Define the class that demonstrates use of finally block
public class Ex4_FinallyBlock {

    // Main method – the entry point of the program
    public static void main(String[] args) {

        // Declare and initialize first number
        int num1 = 10;

        // Uncomment the next line for normal execution (no exception)
        // int num2 = 1;

        // Set num2 to 0 to intentionally cause an ArithmeticException (divide by zero)
        int num2 = 0;

        // Try block is used to handle code that may throw an exception
        try {
            // Try to divide num1 by num2 — will throw ArithmeticException when num2 = 0
            int result = num1 / num2;
        }

        /*
        // CASE 1: If this catch block is uncommented, it will catch ArithmeticException
        // This means the program will NOT crash even if num2 = 0
        catch(ArithmeticException e)
        {
            System.out.println("Exception handled successfully...");
        }
        */

        // CASE 2: This catch block is active, but it only catches NullPointerException
        // So if ArithmeticException occurs, it will NOT be caught, and the program will still crash
        catch (NullPointerException e)
        {
            System.out.println("Exception handled successfully...");
        }

        // finally block ALWAYS executes — no matter if exception is caught, not caught, or no exception
        finally
        {
            System.out.println("Entered into finally block...");
        }

        // These lines will only execute if the exception was caught properly or no exception occurred
        // If ArithmeticException is NOT caught, these lines won't run because the program crashes
        System.out.println("Statement 1");
        System.out.println("Statement 2");
        System.out.println("Statement 3");
    }
}
