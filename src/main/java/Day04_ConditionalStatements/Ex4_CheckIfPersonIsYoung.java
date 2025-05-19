package Day04_ConditionalStatements;
// Import Scanner class to take input from the user
import java.util.Scanner;

public class Ex4_CheckIfPersonIsYoung {
    public static void main(String args[]) {
        // Declare a variable to store the user's age
        float age;

        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter their age
        System.out.println("Enter your age: ");

        // Read the entered age as a floating-point number
        age = sc.nextFloat();

        // Check if the age is between 16 and 55 (considered young)
        if (age >= 16 && age <= 55) {
            // Print a message if the person is young
            System.out.println("You are young!");
        } else {
            // Print a message if the person is not young
            System.out.println("You are not considered young.");
        }

        // Close the Scanner to free up system resources
        sc.close();
    }
}