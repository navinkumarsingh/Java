package Day05_Loops; // Package name (used to organize classes, optional for small programs)

public class Ex15_Print1To10AlongWithEvenOdd { // Class declaration

    public static void main(String[] args) { // Main method - program execution starts here

        /*
         * for loop explanation:
         * 1. Initialization: int i = 1;
         *    - The loop variable 'i' starts at 1.
         * 2. Condition: i <= 10;
         *    - The loop will keep running as long as 'i' is less than or equal to 10.
         * 3. Increment: i++;
         *    - After each iteration, 'i' increases by 1.
         */
        for (int i = 1; i <= 10; i++) {

            /*
             * If-Else condition to check if the current number 'i' is even or odd:
             * i % 2 == 0 means 'i' is divisible by 2 without remainder, so it's even.
             * Otherwise, 'i' is odd.
             */
            if (i % 2 == 0) {
                System.out.println(i + " Even");  // Print number with label "Even"
            } else {
                System.out.println(i + " Odd");   // Print number with label "Odd"
            }
        }
    }
}
