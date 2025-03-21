package ex4_ConditionalStatements;

import java.util.Scanner; // Import Scanner class to take user input

public class Ex13_MonthNameSwitchCase  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input
        System.out.println("Enter a number between 1-12"); // Prompt user to enter a number
        int month = sc.nextInt(); // Read user input as an integer

        // Switch case to match the entered number with corresponding month name
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Month"); // Message for invalid input
        }

        sc.close(); // Close the Scanner object to prevent memory leaks
    }
}
