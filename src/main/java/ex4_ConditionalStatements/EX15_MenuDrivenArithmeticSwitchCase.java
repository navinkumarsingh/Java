package ex4_ConditionalStatements;

import java.util.Scanner;

public class EX15_MenuDrivenArithmeticSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display the arithmetic operation menu to the user
        // "\n" is used to move to the next line for better formatting
        System.out.println("Menu\n====");
        System.out.println("ADD\nSUB\nMUL\nDIV\nMOD"); // List of available operations

        // Prompt user for first number
        System.out.println("Enter first number:");
        double x = sc.nextDouble();  // Use nextDouble() instead of nextInt()

        // Prompt user for second number
        System.out.println("Enter second number:");
        double y = sc.nextDouble();  // Use nextDouble() instead of nextInt()

        sc.nextLine(); // **Important Fix:** Clears the leftover newline (\n) from buffer after reading integers

        // Prompt user for operation choice
        System.out.println("Enter Option in Words");
        String option = sc.nextLine().toUpperCase(); // Reads the user's choice correctly after clearing buffer

        // Switch case to perform the selected operation
        switch (option) {
            case "ADD":
                System.out.println("Sum is :" + (x + y));
                break;
            case "SUB":
                System.out.println("Subtraction is :" + (x - y));
                break;
            case "MUL":
                System.out.println("Multiplication is :" + (x * y));
                break;
            case "DIV":
                // Ensure division by zero is handled properly
                if (y != 0) {
                    System.out.println("Division is :" + (x / y));
                } else {
                    System.out.println("Error: Division by zero is not allowed");
                }
                break;
            case "MOD":
                // Ensure division by zero is handled properly
                if (y != 0) {
                    System.out.println("Modulus (x % y) is: " + (x % y));
                } else {
                    System.out.println("Error: Modulus by zero is not allowed");
                }
                break;
            default:
                System.out.println("Option is Invalid"); // Handles invalid inputs
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
