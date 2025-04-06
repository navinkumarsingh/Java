package ex5_Loops;  // Declares the package name (optional for small programs)

import java.util.Scanner;  // Imports the Scanner class to take user input

public class Ex12_FactorialOf_A_Number {  // Class definition

    public static void main(String[] args) {  // Main method where program execution begins

        Scanner sc = new Scanner(System.in);  // Creates a Scanner object to take user input

        System.out.println("Enter a Number");  // Asks the user to enter a number

        int n = sc.nextInt();  // Reads the integer input from the user and stores it in variable 'n'

        int fact = 1;  // Initializes a variable 'fact' to 1 (since factorial of 0 or 1 is 1)

        // 'for' loop to calculate factorial of 'n'
        for(int i = 1; i <= n; i++) {
            fact = fact * i;  // Multiplies 'fact' by 'i' in each iteration to calculate factorial
        }

        // Prints the final factorial value
        System.out.println("Factorial of " + n + " is: " + fact);

        sc.close();  // Closes the Scanner to free system resources
    }
}

/*
Explanation of Each Step:

import java.util.Scanner;
Imports the Scanner class to take user input.

public class Ex12_FactorialOf_A_Number {
Declares a class named Ex12_FactorialOf_A_Number.

public static void main(A1_String[] args) {
The main method where program execution begins.

Scanner sc = new Scanner(System.in);
Creates a Scanner object sc to read user input.

System.out.println("Enter a Number");
Displays a message asking the user to enter a number.

int n = sc.nextInt();
Reads the integer input from the user and stores it in the variable n.

int fact = 1;
Initializes fact to 1 because multiplying by 1 does not change the result.

for(int i = 1; i <= n; i++) {
Loop starts from 1 and runs up to n.
Each iteration multiplies fact by i to calculate the factorial.

fact = fact * i;
In each iteration, fact is multiplied by the current value of i.

System.out.println("Factorial of " + n + " is: " + fact);
Prints the final factorial result after the loop completes.

sc.close();
Closes the Scanner to prevent memory leaks.

Example Output:
Input: Enter a Number
5
Processing (Step-by-Step Calculation):
fact = 1 * 1 = 1
fact = 1 * 2 = 2
fact = 2 * 3 = 6
fact = 6 * 4 = 24
fact = 24 * 5 = 120
Output:
Factorial of 5 is: 120
 */