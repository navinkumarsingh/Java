// Package name - this class belongs to the package 'ex4_ConditionalStatements'
package ex4_ConditionalStatements;

// Importing Scanner class to allow user input from the console
import java.util.Scanner;

// Class definition
public class Ex10_NumberToWordConverterIfElse {

    // Main method - entry point of the Java program
    public static void main(String[] args) {

        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.println("Enter a number");

        // Reading the number entered by the user and storing it in variable 'num'
        int num = sc.nextInt();

        // Checking if the number is 1
        if (num == 1) {
            // If the number is 1, print "ONE"
            System.out.println("ONE");
        }
        // Checking if the number is 2
        else if (num == 2) {
            // If the number is 2, print "TWO"
            System.out.println("TWO");
        }
        // Checking if the number is 3
        else if (num == 3) {
            // If the number is 3, print "THREE"
            System.out.println("THREE");
        }
        // Checking if the number is 4
        else if (num == 4) {
            // If the number is 4, print "FOUR"
            System.out.println("FOUR");
        }
        // Checking if the number is 5
        else if (num == 5) {
            // If the number is 5, print "FIVE"
            System.out.println("FIVE");
        }
        // Checking if the number is 6
        else if (num == 6) {
            // If the number is 6, print "SIX"
            System.out.println("SIX");
        }
        // If the number is not between 1 and 6
        else {
            // Print message that it is not a valid number
            System.out.println("NOT A VALID NUMBER");
        }

        // Closing the scanner object to free up resources
        sc.close();
    }
}
