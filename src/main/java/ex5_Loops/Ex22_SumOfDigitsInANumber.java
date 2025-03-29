package ex5_Loops; // Defines the package name (used for organizing classes)

import java.util.Scanner; // Importing Scanner class to take user input

public class Ex22_SumOfDigitsInANumber { // Class definition
    public static void main(String[] args) { // Main method - execution starts here

        System.out.println("Enter the Number"); // Prompt the user to enter a number

        Scanner sc  = new Scanner(System.in); // Creating a Scanner object to read user input
        int num = sc.nextInt(); // Storing the user input as an integer

        int sum = 0; // Initializing sum to store the total sum of digits

        // Loop runs until num becomes 0
        while (num > 0) {

            sum = sum + num % 10; // Extracting the last digit using modulus operator (num % 10) and adding it to sum
            num = num / 10; // Removing the last digit by performing integer division (num / 10)
        }

        System.out.println(sum); // Printing the final sum of digits
    }
}


/*
Logic Explanation:
The user enters a number.
The program extracts each digit from the number using num % 10.
It adds the extracted digit to the sum variable.
The last digit is removed from num using num / 10.
The process repeats until all digits are processed (i.e., num becomes 0).
Finally, the total sum of the digits is displayed.
 */