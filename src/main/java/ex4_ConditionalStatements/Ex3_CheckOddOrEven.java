package ex4_ConditionalStatements;

import java.util.Scanner; // Import Scanner class for user input

// Class to check whether a number is odd or even
public class Ex3_CheckOddOrEven {
    public static void main(String args[]) {
        // Declare an integer variable to store the user input
        int n;

        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");

        // Read the input number and store it in variable 'n'
        n = sc.nextInt();

        // Check if the number is even or odd using the modulus operator
        if (n % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

        // Close the scanner object to prevent resource leakage
        sc.close();
    }
}