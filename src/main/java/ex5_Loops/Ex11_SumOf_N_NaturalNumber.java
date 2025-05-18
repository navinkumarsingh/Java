package ex5_Loops;  // Package name where this class belongs

import java.util.Scanner;  // Import Scanner class to read user input

public class Ex11_SumOf_N_NaturalNumber {  // Class definition
    // Program to calculate the sum of first 'n' natural numbers entered by the user

    public static void main(String[] args) {  // Main method where program execution starts

        Scanner sc = new Scanner(System.in);  // Create Scanner object to take input from user

        System.out.println("Enter a number");  // Prompt user to enter a number

        int n = sc.nextInt();  // Read the integer input from user and store in variable 'n'

        int sum = 0;  // Initialize sum variable to 0, this will store the final sum

        /*
         * The for loop below is used to add all natural numbers from 1 to 'n'
         *
         * Syntax explanation:
         * for (initialization; condition; increment) {
         *     // statements to repeat
         * }
         */

        // Start the loop with i = 1 (first natural number)
        // Continue looping while i is less than or equal to n (the user input)
        // After each loop, increase i by 1 (i++) to move to the next number
        for (int i = 1; i <= n; i++) {

            // Add the current value of i to the sum
            // sum = sum + i;
            // For example, if sum is 0 and i is 1, sum becomes 0 + 1 = 1
            // In next iteration, if i is 2, sum becomes 1 + 2 = 3, and so on...
            sum = sum + i;

            // You can also think of it as:
            // sum accumulates the total as the loop progresses through numbers from 1 to n
        }

        // After the loop ends, print the final sum value
        System.out.println("Sum of " + n + " natural numbers is: " + sum);

        sc.close();  // Close the Scanner object to avoid resource leaks
    }
}
