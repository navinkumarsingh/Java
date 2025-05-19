// Define the package this file belongs to
package Day05_Loops;

// Main class to demonstrate an infinite do-while loop
public class Ex5_InfiniteDoWhileLoop {

    // Main method - program entry point
    public static void main(String[] args) {

        // Start a do-while loop
        do {
            // Print this message continuously because the loop never ends
            System.out.println("Running forever...");
        }
        // The loop condition is always true, so the loop runs forever
        while (true);
    }
}
