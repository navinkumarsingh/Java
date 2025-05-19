package Day05_Loops; // Package name (used to organize classes, optional for small programs)

public class Ex16_Print1To10InDescOrder { // Class declaration

    public static void main(String[] args) { // Main method where program execution begins

        /*
         * For loop explanation:
         * 1. Initialization: int i = 10;
         *    - The loop variable 'i' starts at 10.
         * 2. Condition: i > 0;
         *    - The loop continues as long as 'i' is greater than 0.
         * 3. Decrement: i--;
         *    - After each iteration, 'i' decreases by 1.
         */
        for (int i = 10; i > 0; i--) {
            System.out.println(i); // Prints the current value of 'i' on each line
        }
    }
}
