package ex5_Loops;  // Declares the package name (optional for small programs)

import java.util.Scanner;  // Imports the Scanner class to take user input

public class Ex11_SumOf_N_NaturalNumber {  // Class definition
    // A natural number is a positive number starting from 1. Example: 1, 2, 3, 4, 5, ..., n

    public static void main(String[] args) {  // Main method where program execution begins

        Scanner sc = new Scanner(System.in);  // Creates a Scanner object to take user input

        System.out.println("Enter a number");  // Asks the user to enter a number

        int n = sc.nextInt();  // Reads the integer input from the user and stores it in variable 'n'

        int sum = 0;  // Initializes a variable 'sum' to 0, which will store the total sum

        // 'for' loop to calculate the sum of first 'n' natural numbers
        for(int i = 1; i <= n; i++) {
            sum = sum + i;  // Adds the current number 'i' to 'sum' in each iteration
        }

        // Prints the final sum after the loop completes
        System.out.println("Sum of " + n + " natural number is: " + sum);

        sc.close();  // Closes the Scanner to free system resources
    }
}


/*
Explanation of Each Step:
import java.util.Scanner;
Imports Scanner class to take input from the user.

public class Ex11_SumOf_N_NaturalNumber {
Declares a public class named Ex11_SumOf_N_NaturalNumber.

public static void main(A1_String[] args) {
The main method where program execution begins.

Scanner sc = new Scanner(System.in);
Creates a Scanner object sc to read user input.

System.out.println("Enter a number");
Displays a message asking the user to enter a number.

int n = sc.nextInt();
Reads the integer input from the user and stores it in the variable n.

int sum = 0;
Initializes the variable sum to 0 to store the final sum.

for(int i = 1; i <= n; i++) {
Loop runs from 1 to n.
i is incremented by 1 in each iteration.

sum = sum + i;
Adds the current value of i to sum.

System.out.println("Sum of " + n + " natural numbers is: " + sum);
Prints the final sum after the loop finishes.

sc.close();
Closes the Scanner to prevent memory leaks.

Example Output:
Input:
Enter a number
5

Processing:
sum = 0 + 1 = 1
sum = 1 + 2 = 3
sum = 3 + 3 = 6
sum = 6 + 4 = 10
sum = 10 + 5 = 15

Output:
Sum of 5 natural number is: 15
 */