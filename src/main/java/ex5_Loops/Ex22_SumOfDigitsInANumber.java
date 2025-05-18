package ex5_Loops; // Defines the package name (used to organize classes)

import java.util.Scanner; // Import Scanner class to read input from user

public class Ex22_SumOfDigitsInANumber { // Class definition
    public static void main(String[] args) { // Main method - execution starts here

        System.out.println("Enter the Number"); // Ask the user to enter a number

        Scanner sc  = new Scanner(System.in); // Create Scanner object to get input from user
        int num = sc.nextInt(); // Read the integer input and store it in variable 'num'

        int sum = 0; // Initialize sum to 0, this will store the total of all digits

        // Run the loop until 'num' becomes 0
        while (num > 0) {

            // Extract the last digit of 'num' by using modulus operator (%)
            // Add the last digit to 'sum'
            sum = sum + num % 10;

            // Remove the last digit from 'num' by dividing by 10 (integer division)
            num = num / 10;
        }

        System.out.println(sum); // Print the total sum of all digits

        sc.close(); // Close the Scanner to free system resources
    }
}

/*
Logic Explanation:
- The user inputs a number (e.g., 1234).
- The program extracts the last digit using 'num % 10' (e.g., 4).
- This digit is added to the sum.
- Then the last digit is removed from the number using integer division 'num / 10' (e.g., 123).
- The process repeats until the number becomes 0.
- Finally, the program prints the sum of all digits (e.g., 1+2+3+4 = 10).
*/
