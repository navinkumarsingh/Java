// Define the package this file belongs to
package Day05_Loops;

// Main class to demonstrate the do-while loop with powers of two
public class Ex3_DoWhileLoopPowerOfTwo {

    // Main method - the entry point of the program
    public static void main(String[] args) {

        // Step 1: Initialize 'i' to 1, this will hold powers of 2 (1, 2, 4, 8, ...)
        int i = 1;

        // Step 2: Start a do-while loop which executes the block at least once
        do {
            // Step 3: Print the current value of 'i' to the console
            System.out.println(i);

            // Step 4: Double the value of 'i' by multiplying it by 2
            i = i * 2;
        }
        // Step 5: Continue the loop as long as 'i' is less than 100
        while (i < 100);
    }
}
