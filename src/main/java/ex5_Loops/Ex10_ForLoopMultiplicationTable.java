// Declare the package name
package ex5_Loops;

// Import Scanner class to get user input from the keyboard
import java.util.Scanner;

public class Ex10_ForLoopMultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a number for which multiplication table is needed
        System.out.println("Enter a Number");

        // Read the integer number entered by the user and store it in variable 'n'
        int n = sc.nextInt();

        // For loop to iterate from 1 to 10 to print multiplication table of 'n'
        for (int i = 1; i <= 10; i++) {
            // Print the multiplication in format: n x i = (n*i)
            System.out.println("Multiplication table of 5 is: " + n + "x" + i + " = " + (n * i));
        }

        // Close the scanner object to avoid resource leak
        sc.close();
    }
}
