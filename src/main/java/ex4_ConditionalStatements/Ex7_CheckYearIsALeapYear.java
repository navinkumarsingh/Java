package ex4_ConditionalStatements;
// Importing the Scanner class to take user input
import java.util.Scanner;

// Defining the main class
public class Ex7_CheckYearIsALeapYear {
    public static void main(String[] args) {  // Main method - Entry point of the program
        Scanner sc = new Scanner(System.in);  // Creating a Scanner object to read input
        int year;  // Declaring an integer variable to store the year

        // Asking the user to enter a year
        System.out.println("Enter a year: ");
        year = sc.nextInt();  // Taking integer input from the user

        // Checking if the year is a leap year
        if (year % 4 == 0) {  // A year is a leap year if it is divisible by 4
            if (year % 100 == 0) {  // If divisible by 100, it might not be a leap year
                if (year % 400 == 0) {  // If also divisible by 400, it is a leap year
                    System.out.println("Leap year");
                } else {  // If divisible by 100 but not by 400, it is not a leap year
                    System.out.println("Not a Leap year");
                }
            } else {  // If divisible by 4 but not by 100, it is a leap year
                System.out.println("Leap year");
            }
        } else {  // If not divisible by 4, it is not a leap year
            System.out.println("Not a Leap year");
        }

        sc.close();  // Closing the Scanner to free up resources
    }
}