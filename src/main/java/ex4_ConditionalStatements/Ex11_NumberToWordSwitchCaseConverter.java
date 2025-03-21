package ex4_ConditionalStatements;

import java.util.Scanner; // Import Scanner class to take user input

// Main class to handle user input and call the appropriate converter
public class Ex11_NumberToWordSwitchCaseConverter  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object to take user input
        System.out.println("Enter a number (1-6):"); // Prompt user to enter a number

        if (sc.hasNextInt()) { // Check if input is an integer
            int num = sc.nextInt();
            NumberToWordConverter converter = new NumberToWordConverter(); // Create an instance of NumberToWordConverter
            converter.convertNumber(num); // Convert number to word
        } else { // If input is not an integer, process it as a string
            String num = sc.next().trim(); // Read input as a string and trim spaces
            StringNumberToWordConverter strConverter = new StringNumberToWordConverter(); // Create an instance of StringNumberToWordConverter
            strConverter.convertStringNumber(num); // Convert string number to word
        }

        sc.close(); // Close the Scanner object to avoid memory leaks
    }
}

// Class to handle numeric input and display the number in words
class NumberToWordConverter {
    public void convertNumber(int num) {
        if (num >= 1 && num <= 6) { // Check if the number is between 1 and 6
            switch (num) { // Switch case to display corresponding word
                case 1:
                    System.out.println("ONE");
                    break;
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
                    System.out.println("NOT A VALID NUMBER");
            }
        } else {
            System.out.println("Invalid input. Please enter a number between 1 to 6");
        }
    }
}

// Class to handle string input and display the number in words
class StringNumberToWordConverter {
    public void convertStringNumber(String num) {
        switch (num) { // Switch case to display corresponding word
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
                System.out.println("Invalid input. Please enter a number between 1 to 6");
        }
    }
}

