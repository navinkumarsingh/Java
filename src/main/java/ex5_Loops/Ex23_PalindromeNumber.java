package ex5_Loops; // Defines the package name (used to organize classes)

import java.util.Scanner; // Imports the Scanner class to take user input

// A palindrome is a word, number, phrase, or sequence that reads the same forward and backward.

public class Ex23_PalindromeNumber { // Class definition
    public static void main(String[] args) { // Main method - program starts here

        Scanner sc = new Scanner(System.in); // Create Scanner object to read input from user

        System.out.println("Enter a Number"); // Ask user to enter a number

        int num = sc.nextInt(); // Read user input number and store it in variable 'num'

        int actualNum = num; // Store the original number in 'actualNum' to compare later

        int reverseNum = 0; // Initialize 'reverseNum' to store reversed number, start at 0

        // Loop until all digits are processed (until num becomes 0)
        while (num > 0) {

            // Extract the last digit of 'num' using modulus operator (%)
            // Multiply reverseNum by 10 and add the last digit to it (build reversed number)
            reverseNum = reverseNum * 10 + num % 10;

            // Remove the last digit from 'num' by dividing by 10 (integer division)
            num = num / 10;
        }

        // After the loop, 'reverseNum' holds the reversed number
        // Check if original number and reversed number are the same
        if (actualNum == reverseNum) {
            System.out.println(actualNum + " -> is a Palindrome Number"); // It's a palindrome
        } else {
            System.out.println(actualNum + " -> is not a Palindrome Number"); // Not a palindrome
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}

/*
Step-by-Step Logic:

1. Take input from the user.
2. Save the original number because 'num' will be changed while reversing.
3. Reverse the number by extracting digits from the end one by one and adding to 'reverseNum'.
4. Once reversed, compare the reversed number with the original.
5. If both match, the number is a palindrome.
6. If not, it's not a palindrome.

Example:
Input: 121
Reverse: 121
Since both are equal, output: "121 -> is a Palindrome Number"

Input: 123
Reverse: 321
Not equal, output: "123 -> is not a Palindrome Number"
*/
