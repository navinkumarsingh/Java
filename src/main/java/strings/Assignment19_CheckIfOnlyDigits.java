package strings;
import java.util.Scanner;
public class Assignment19_CheckIfOnlyDigits {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Call the method to check if the string contains only digits and store the result
        boolean result = containsOnlyDigits(str);

        // Print the result
        System.out.println("String contains only digits: " + result);

        // Close the scanner
        scanner.close();
    }

    // Method to check if a string contains only digits
    public static boolean containsOnlyDigits(String str) {
        // Iterate over each character in the input string
        for (char ch : str.toCharArray()) {
            // If the character is not a digit, return false
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        // If all characters are digits, return true
        return true;
    }
}