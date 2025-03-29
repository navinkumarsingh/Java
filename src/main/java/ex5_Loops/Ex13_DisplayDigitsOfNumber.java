package ex5_Loops;  // Declares the package name (used for organizing Java files)

import java.util.Scanner;  // Imports Scanner class to take user input

public class Ex13_DisplayDigitsOfNumber {  // Declares a class named Ex13_DisplayDigitsOfNumber

    public static void main(String[] args) {  // Main method where program execution starts

        Scanner sc = new Scanner(System.in);  // Creates a Scanner object to take input from the user

        System.out.println("Enter the Number");  // Prompts the user to enter a number

        int n = sc.nextInt();  // Reads an integer from the user and stores it in 'n'

        // While loop to extract and print digits one by one
        while (n > 0) {
            int r = n % 10;  // Extracts the last digit of 'n' using modulus operator (%)
            n = n / 10;  // Removes the last digit from 'n' by dividing it by 10
            System.out.println(r);  // Prints the extracted digit
        }
    }
}

/*
How This Program Works (Step-by-Step Explanation)
1️⃣ Taking User Input
The program begins by importing Scanner to take user input.
It asks the user to enter a number.
The number is stored in the integer variable n.
2️⃣ Extracting and Printing Digits
A while loop is used to extract and display each digit of the number.
The loop runs until n becomes 0.
Inside the loop:
r = n % 10;
This extracts the last digit of n.
Example: If n = 123, then 123 % 10 = 3, so r = 3.
n = n / 10;
This removes the last digit of n.
Example: If n = 123, then 123 / 10 = 12, so n becomes 12.
The extracted digit r is printed.
3️⃣ Loop Execution Example
If the user enters 1234, the program processes it as follows:

Step	Value of n	Extracted Digit (r = n % 10)	Updated n (n = n / 10)	Printed Output
1st Iteration	1234	1234 % 10 = 4	1234 / 10 = 123	4
2nd Iteration	123	123 % 10 = 3	123 / 10 = 12	3
3rd Iteration	12	12 % 10 = 2	12 / 10 = 1	2
4th Iteration	1	1 % 10 = 1	1 / 10 = 0	1
5th Iteration	0 (Loop Ends)	-	-	-
4️⃣ Output
If the user enters 1234, the output will be:

mathematica
Copy code
Enter the Number
1234
4
3
2
1
(Note: The digits are printed in reverse order because we extract the last digit first.)

Why is the Program Written This Way?
while(n > 0) is used

Because we need to process all digits until n becomes 0.
int r = n % 10; is used

The modulus operator (% 10) helps extract the last digit of a number.
n = n / 10; is used

Integer division by 10 removes the last digit from n after each iteration.
Why is the loop not running indefinitely?

Because n reduces after each iteration, and when n becomes 0, the loop stops.

int r = 1%10?

ChatGPT said:
The expression 1 % 10 performs the modulo operation, which gives the remainder when dividing 1 by 10.

In this case:

1 ÷ 10 results in 0 with a remainder of 1.

So, the result of 1 % 10 is 1.

Thus, int r = 1 % 10; will assign the value 1 to r.

More Explanation:
n=1/10?

The expression n = 1 / 10 in most programming languages will perform integer division if both operands are integers.
In Java, for example, both 1 and 10 are integers, so the result of 1 / 10 will be 0 because the fractional part is discarded.
However, if you want a result that includes the fractional part (i.e., 0.1), you need to make sure that one or both of the numbers are treated as floating-point numbers. You can do this by casting one of the operands to double or float.

For example:
n = 1.0 / 10 or n = 1 / 10.0 will give 0.1.

Example in Java:
int n = 1 / 10;      // n will be 0 because it's integer division
double n = 1.0 / 10; // n will be 0.1 because it's floating-point division
So, if n = 1 / 10, and both are integers, the result will be 0.

 */
