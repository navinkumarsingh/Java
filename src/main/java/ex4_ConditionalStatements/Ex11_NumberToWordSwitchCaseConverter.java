// Define the package name this file belongs to
package ex4_ConditionalStatements;

// Import the Scanner class to take user input from the keyboard
import java.util.Scanner;

// Main class to run the program
public class Ex11_NumberToWordSwitchCaseConverter {

    // Main method: the entry point of the program
    public static void main(String[] args) {

        // Create a Scanner object 'sc' to read user input from the console
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number between 1 and 6
        System.out.println("Enter a number (1-6):");

        // Check if the user input is an integer (e.g., 1, 2, 3)
        if (sc.hasNextInt()) {
            // Read the integer input from the user
            int num = sc.nextInt();

            // Create an object of the NumberToWordConverter class
            NumberToWordConverter converter = new NumberToWordConverter();

            // Call the method to convert the entered number into a word
            converter.convertNumber(num);
        } else {
            // If the input is not an integer, treat it as a string (like "1" or "two")

            // Read the input as a string and remove any extra spaces
            String num = sc.next().trim();

            // Create an object of the StringNumberToWordConverter class
            StringNumberToWordConverter strConverter = new StringNumberToWordConverter();

            // Call the method to convert the string input into a word
            strConverter.convertStringNumber(num);
        }

        // Close the Scanner object to prevent memory leaks
        sc.close();
    }
}

// A helper class to convert numeric (int) input into word format
class NumberToWordConverter {

    // Method to convert integer numbers into words
    public void convertNumber(int num) {

        // Check if the number is within the valid range (1 to 6)
        if (num >= 1 && num <= 6) {

            // Use switch-case to match the number and print the corresponding word
            switch (num) {
                case 1:
                    System.out.println("ONE");
                    break; // Exit switch after match is found
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                default:
                    // This line will never run due to earlier range check
                    System.out.println("NOT A VALID NUMBER");
            }

        } else {
            // If number is not between 1 to 6, show error message
            System.out.println("Invalid input. Please enter a number between 1 to 6");
        }
    }
}

// A helper class to convert string input (like "1" or "three") into word format
class StringNumberToWordConverter {

    // Method to convert string numbers into words
    public void convertStringNumber(String num) {

        // Use switch-case to match the string and print corresponding word
        switch (num) {
            case "1":
                System.out.println("ONE");
                break;
            case "2":
                System.out.println("TWO");
                break;
            case "3":
                System.out.println("THREE");
                break;
            case "4":
                System.out.println("FOUR");
                break;
            case "5":
                System.out.println("FIVE");
                break;
            case "6":
                System.out.println("SIX");
                break;
            default:
                // If input doesn't match any valid number string
                System.out.println("Invalid input. Please enter a number between 1 to 6");
        }
    }
}
