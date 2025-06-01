// Package declaration
package Day21_ScannerClassAndExceptionHandling;

// Class to demonstrate the use of the 'throw' keyword and exception handling
public class Ex6_ThrowKeyword {

    // Method to find the square of a number
    void findSquare(int num) {
        // Check if the number is less than 1 (i.e., negative or zero)
        if (num < 1) {
            // If number is less than 1, we throw an ArithmeticException manually using 'throw'
            // 'throw' is used to explicitly generate an exception in our program
            // This stops the execution of this method and jumps to the catch block (if present)
            throw new ArithmeticException("Number is negative, cannot calculate square");

            // Alternatively, you could print an error message instead of throwing an exception
            // But throwing an exception helps in letting the caller handle the error
            // System.out.println("Number is negative, cannot calculate square");
        } else {
            // If number is valid, print its square
            System.out.println(num * num);
        }
    }

    // Main method - program execution starts here
    public static void main(String[] args) {
        // Creating an object of the current class
        Ex6_ThrowKeyword tk = new Ex6_ThrowKeyword();

        try {
            // Try calling the method with a valid number
            // If the number is negative or 0, the method will throw an exception
            tk.findSquare(0);  // Try changing this to 0 or -5 to test exception
        }
        // Catch block that handles the exception thrown by the findSquare() method
        catch (ArithmeticException e) {
            // This block runs when an ArithmeticException is thrown in the try block
            // So we can provide a custom message or take corrective action
            System.out.println("Exception Handled");
        }
    }
}
