package ex4_ConditionalStatements;

import java.util.Scanner;

public class MenuDrivenArithmeticSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display menu options
        System.out.println("Menu");
        System.out.println("====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        // Prompt user for first number
        System.out.println("Enter first number");
        int x = sc.nextInt(); // Reads the first number but does NOT consume the newline character (\n)

        // Prompt user for second number
        System.out.println("Enter second number");
        int y = sc.nextInt(); // Reads the second number but again leaves a newline character (\n) in the buffer

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
            default:
                System.out.println("Option is Invalid"); // Handles invalid inputs
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
