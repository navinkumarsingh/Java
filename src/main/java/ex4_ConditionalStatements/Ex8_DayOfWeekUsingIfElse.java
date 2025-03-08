package ex4_ConditionalStatements;

// Importing Scanner class to take user input
import java.util.Scanner;

// Class definition
public class Ex8_DayOfWeekUsingIfElse {

    // Main method - execution starts here
    public static void main(String[] args) {

        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Asking the user to enter a number
        System.out.println("Enter a Number");

        // Reading the number input by the user
        int num = sc.nextInt();

        // Checking the value of num and printing the corresponding day of the week
        if (num == 1) {  // If number is 1, print "Sunday"
            System.out.println("Sunday");
        }
        else if (num == 2) {  // If number is 2, print "Monday"
            System.out.println("Monday");
        }
        else if (num == 3) {  // If number is 3, print "Tuesday"
            System.out.println("Tuesday");
        }
        else if (num == 4) {  // If number is 4, print "Wednesday"
            System.out.println("Wednesday");
        }
        else if (num == 5) {  // If number is 5, print "Thursday"
            System.out.println("Thursday");
        }
        else if (num == 6) {  // If number is 6, print "Friday"
            System.out.println("Friday");
        }
        else if (num == 7) {  // If number is 7, print "Saturday"
            System.out.println("Saturday");
        }
        else {  // If the number is not between 1-7, print an error message
            System.out.println("Not a valid number");
        }

        // Closing the Scanner object to prevent resource leak
        sc.close();
    }
}