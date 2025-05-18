package ex5_Loops;  // Defines the package name (used to organize classes logically)

import java.util.Scanner;  // Imports Scanner class to get input from user

public class Ex14_CountDigitsOfNumber {  // Class definition
    public static void main(String[] args) {  // Main method - starting point of the program

        Scanner sc = new Scanner(System.in);  // Create Scanner object to read user input

        System.out.println("Enter the Number");  // Prompt the user to enter a number

        int n = sc.nextInt();  // Read the integer input from the user and store in variable 'n'

        int count = 0;  // Initialize 'count' to zero, this will keep track of how many digits are in 'n'

        /*
         * Loop Explanation:
         * while(n > 0) means the loop will continue as long as 'n' is greater than 0.
         *
         * Inside the loop:
         * 1. int r = n % 10;
         *    - This extracts the last digit of 'n'.
         *    - The modulus operator (%) gives the remainder after dividing by 10.
         *    - Example: If n = 1234, 1234 % 10 = 4, so r = 4 (the last digit).
         *
         * 2. n = n / 10;
         *    - This removes the last digit from 'n' by dividing it by 10.
         *    - Integer division discards the decimal part.
         *    - Example: If n = 1234, 1234 / 10 = 123 (removes the last digit).
         *
         * 3. count++;
         *    - Increase the digit count by 1 since we've just processed one digit.
         *
         * The loop continues until all digits have been counted (n becomes 0).
         */

        while (n > 0) {
            int r = n % 10;  // Extract last digit (not actually used here, but shows how digits are processed)
            n = n / 10;      // Remove last digit from the number
            count++;         // Increase digit count by 1
        }

        // Print the total number of digits counted
        System.out.println("Count of digits are: " + count);

        sc.close();  // Close the Scanner object to free resources
    }
}
