package ex5_Loops; // Defines the package name (used for organizing classes)

import java.util.Scanner; // Imports the Scanner class to take user input

public class Ex14_CountDigitsOfNumber { // Class definition
    public static void main(String[] args) { // Main method - execution starts here

        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.println("Enter the Number");

        // Reading an integer input from the user and storing it in variable 'n'
        int n = sc.nextInt();

        // Variable to keep track of the count of digits
        int count = 0;

        // Loop runs until 'n' becomes 0
        while(n > 0) {

            // Extracts the last digit of 'n' using modulo (%) operation
            int r = n % 10;

            // Removes the last digit from 'n' by performing integer division (/)
            n = n / 10;

            // Increases the count by 1 for each digit encountered
            count++;
        }

        // Prints the total count of digits in the given number
        System.out.println("Count of digits are: " + count);

        // Closing the Scanner object to avoid memory leaks
        sc.close();
    }
}
