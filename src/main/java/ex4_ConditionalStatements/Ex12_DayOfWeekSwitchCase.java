package ex4_ConditionalStatements;

import java.util.Scanner; // Import Scanner class to take user input

public class Ex12_DayOfWeekSwitchCase  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input

        System.out.println("Enter the number between 1-7"); // Prompt user to enter a number
        int day = sc.nextInt(); // Read integer input from user

        // Switch case to match the input number with corresponding day of the week
        switch(day) {
            case 1:
                System.out.println("Sunday");
                break; // Exit switch after matching case
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day"); // Handle invalid input (not between 1-7)
        }
        sc.close(); // Close the Scanner to prevent resource leak
    }
}
