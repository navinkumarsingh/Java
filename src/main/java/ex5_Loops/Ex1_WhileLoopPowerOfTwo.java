// Define the package name this file belongs to
package ex5_Loops;

// Main class to demonstrate the while loop and power of two
public class Ex1_WhileLoopPowerOfTwo {

    // Main method: this is where the program starts running
    public static void main(String[] args) {

        // Step 1: Initialize a variable 'i' with value 1
        // This will be used to calculate powers of 2 (like 1, 2, 4, 8, ...)
        int i = 1;

        // Step 2: Start a while loop that runs as long as 'i' is less than 100
        while (i < 100) {

            // Step 3: Print the current value of 'i' to the console
            System.out.println(i);

            // Step 4: Multiply 'i' by 2 and store the result back in 'i'
            // This creates the next power of 2 (1, 2, 4, 8, 16, ...)
            i = i * 2;
        }
    }
}
