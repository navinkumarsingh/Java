package Day05_Loops;  // Package name to organize classes

import java.util.Scanner;  // Import Scanner to read input from user

public class Ex21_CountNumberOfEvenAndOddDigitsInANumber {  // Class definition
    public static void main(String[] args) {  // Main method where program execution starts

        Scanner sc = new Scanner(System.in);  // Create Scanner object to read user input

        System.out.println("Enter the Number");  // Ask user to enter a number

        int num = sc.nextInt();  // Read the integer input from user and store in variable 'num'

        int evenDigitCount = 0;  // Variable to keep track of count of even digits, initially 0
        int oddDigitCount = 0;   // Variable to keep track of count of odd digits, initially 0

        // Loop will run as long as 'num' is greater than 0
        while(num > 0) {

            int rev = num % 10;  // Extract last digit of 'num' using modulus operator (%)

            num = num / 10;  // Remove last digit from 'num' by dividing it by 10 (integer division)

            // Check if the extracted digit 'rev' is even
            if(rev % 2 == 0) {
                evenDigitCount++;  // If digit is even, increment evenDigitCount by 1
            }
            else {
                oddDigitCount++;  // If digit is odd, increment oddDigitCount by 1
            }
        }

        // Print the total number of even digits found
        System.out.println("Even digit counts are: " + evenDigitCount);

        // Print the total number of odd digits found
        System.out.println("Odd digit counts are: " + oddDigitCount);

        sc.close();  // Close the Scanner object to free resources
    }
}
