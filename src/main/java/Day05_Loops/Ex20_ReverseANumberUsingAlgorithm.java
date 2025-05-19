package Day05_Loops; // Package name to organize related classes

import java.util.Scanner; // Import Scanner class to take input from the user

public class Ex20_ReverseANumberUsingAlgorithm { // Class definition
    public static void main(String[] args) { // Main method - program execution starts here

        Scanner sc = new Scanner(System.in); // Create Scanner object to read user input

        System.out.println("Enter a Number"); // Prompt user to enter a number

        int n = sc.nextInt(); // Read the input number from user and store in variable n (e.g., 1234)

        int revNum = 0; // Initialize variable to store the reversed number, starting from 0

        // Loop runs as long as n is greater than 0
        while (n > 0) {
            // Extract the last digit of n using modulus operator (%)
            // Add this digit to revNum after shifting revNum's digits one place left (multiply by 10)
            revNum = revNum * 10 + n % 10;

            // Remove the last digit from n by dividing it by 10 (integer division)
            n = n / 10;
        }

        // Print the reversed number
        System.out.println(revNum);

        sc.close(); // Close Scanner object to prevent resource leak
    }
}

/*
How it works:

1. User enters a number, e.g., 123
2. revNum starts at 0
3. Loop iteration 1:
   - n % 10 = 3 (last digit)
   - revNum = 0 * 10 + 3 = 3
   - n = 123 / 10 = 12
4. Loop iteration 2:
   - n % 10 = 2
   - revNum = 3 * 10 + 2 = 32
   - n = 12 / 10 = 1
5. Loop iteration 3:
   - n % 10 = 1
   - revNum = 32 * 10 + 1 = 321
   - n = 1 / 10 = 0 (loop ends)
6. revNum = 321, which is the reverse of the original number

Output:
Enter a Number
123
321
*/
