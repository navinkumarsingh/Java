package Day04_ConditionalStatements;

import java.util.Scanner; // Import Scanner class for user input

// Class to determine the radix (base) of a given number in string format
public class Ex6_DetermineNumberRadix {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Declare a string variable to store the input number
        String num;

        // Prompt the user to enter a number
        System.out.println("Enter a number:");
        // Reads the entire user input as a string, allowing spaces and different numeral formats for validation.
        num = sc.nextLine();

        // Check if the number is Binary (contains only 0s and 1s)
        if (num.matches("[01]+")) {
            System.out.println("Binary Radix = 2");
        }
        // Check if the number is Octal (contains only digits 0-7)
        else if (num.matches("[0-7]+")) {
            System.out.println("Octal Radix = 8");
        }
        // Check if the number is Decimal (contains only digits 0-9)
        else if (num.matches("^[0-9]+$")) {  // Corrected regex
            System.out.println("Decimal Radix = 10");
        }
        // Check if the number is Hexadecimal (contains digits 0-9 and letters A-F/a-f)
        else if (num.matches("[0-9A-Fa-f]+")) {
            System.out.println("Hexadecimal Radix = 16");
        }
        // If the input doesn't match any of the above formats, it's invalid
        else {
            System.out.println("Invalid Number Format");
        }

        // Close the Scanner object to prevent resource leakage
        sc.close();
    }
}