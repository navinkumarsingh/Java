package Day05_Loops;  // Package name declaration (optional for small programs)

import java.util.Scanner;  // Import Scanner class to read input from the user

public class Ex12_FactorialOf_A_Number {  // Class definition for factorial calculation

    public static void main(String[] args) {  // Main method where the program starts execution

        Scanner sc = new Scanner(System.in);  // Create Scanner object to take input from the user

        System.out.println("Enter a Number");  // Prompt user to enter a number

        int n = sc.nextInt();  // Read the integer input and store it in variable 'n'

        int fact = 1;  // Initialize 'fact' to 1 because factorial multiplication starts with 1

        /*
         * The 'for' loop below calculates the factorial of the number 'n'
         *
         * Syntax of for loop:
         * for (initialization; condition; increment) {
         *    // loop body
         * }
         *
         * Explanation of this for loop:
         * - Initialization: int i = 1; --> We start multiplying from 1
         * - Condition: i <= n; --> Loop runs as long as i is less than or equal to n
         * - Increment: i++ --> Increase i by 1 in every iteration
         *
         * Loop body: fact = fact * i;
         * In each iteration, we multiply the current value of 'fact' by 'i' and store the result back in 'fact'.
         * This accumulates the product of all numbers from 1 to n.
         *
         * Example: If n = 5,
         * Iteration 1: fact = 1 * 1 = 1
         * Iteration 2: fact = 1 * 2 = 2
         * Iteration 3: fact = 2 * 3 = 6
         * Iteration 4: fact = 6 * 4 = 24
         * Iteration 5: fact = 24 * 5 = 120
         * So, factorial of 5 is 120.
         */

        for (int i = 1; i <= n; i++) {
            fact = fact * i;  // Multiply current fact value by i in each iteration
        }

        // After loop ends, print the factorial result
        System.out.println("Factorial of " + n + " is: " + fact);

        sc.close();  // Close Scanner object to avoid memory/resource leaks
    }
}
