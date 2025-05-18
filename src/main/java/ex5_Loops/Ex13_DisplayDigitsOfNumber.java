package ex5_Loops;  // Declares the package name (used to organize Java files)

import java.util.Scanner;  // Imports Scanner class to read user input

public class Ex13_DisplayDigitsOfNumber {  // Class declaration

    public static void main(String[] args) {  // Main method where execution starts

        Scanner sc = new Scanner(System.in);  // Create Scanner object to take input from the user

        System.out.println("Enter the Number");  // Prompt the user to enter a number

        int n = sc.nextInt();  // Read the integer input from the user and store it in variable 'n'

        /*
         * The goal is to extract and display each digit of the number 'n'.
         * For example, if n = 1234, we want to print digits: 4, 3, 2, 1 (in reverse order).
         *
         * Explanation of the while loop below:
         *
         * while (n > 0)
         * - The loop runs as long as n is greater than 0.
         * - When n becomes 0, it means all digits have been processed, and the loop stops.
         *
         * Inside the loop:
         * int r = n % 10;
         * - The modulus operator (%) gives the remainder when n is divided by 10.
         * - This remainder is the last digit of n.
         * - Example: If n = 1234, then 1234 % 10 = 4, so r = 4.
         *
         * n = n / 10;
         * - This divides n by 10 using integer division, effectively removing the last digit.
         * - Integer division discards the decimal part.
         * - Example: If n = 1234, then 1234 / 10 = 123.
         *
         * System.out.println(r);
         * - Prints the last digit extracted from the number.
         *
         * This process repeats until n becomes 0.
         */

        while (n > 0) {
            int r = n % 10;  // Extract the last digit of 'n'
            n = n / 10;      // Remove the last digit from 'n'
            System.out.println(r);  // Print the extracted digit
        }

        sc.close();  // Close the Scanner object to free system resources
    }
}
