package Day04_ConditionalStatements;

import java.util.Scanner; // Import Scanner class for user input

// Class to calculate the grade of a student based on marks
public class Ex5_CalculateStudentGrade {
    public static void main(String[] args) {
        // Declare integer variables to store marks of three subjects
        int m1, m2, m3;

        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter three subject marks as integers using nextInt()
        System.out.println("Enter marks of 3 Subjects (Integer values): ");
        m1 = sc.nextInt(); // Reading first integer input
        m2 = sc.nextInt(); // Reading second integer input
        m3 = sc.nextInt(); // Reading third integer input

        // Calculating average, explicitly converting sum to float to avoid integer division
        float avg = (m1 + m2 + m3) / 3.0f;

        // Checking conditions to assign grades based on average marks
        if (avg > 70) {
            System.out.println("Grade A");
        } else if (avg >= 60) {  // No need to check < 70 as it's already handled above
            System.out.println("Grade B");
        } else if (avg >= 50) {
            System.out.println("Grade C");
        } else if (avg >= 40) {
            System.out.println("Grade D");
        } else {
            System.out.println("FAIL");
        }

        // Closing Scanner to prevent memory leaks
        sc.close();
    }
}