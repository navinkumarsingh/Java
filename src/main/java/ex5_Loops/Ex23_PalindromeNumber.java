package ex5_Loops; // Defines the package name (used for organizing classes)

import java.util.Scanner; // Imports the Scanner class for user input
//A palindrome is a word, number, phrase, or sequence that reads the same forward and backward.
/*
Checking for a Palindrome: To check if a string or number is a palindrome:
Reverse it.
Compare it with the original.
 */
public class Ex23_PalindromeNumber { // Class definition
    public static void main(String[] args) { // Main method - execution starts here

        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Asking the user to enter a number
        System.out.println("Enter a Number");

        // Storing the user input in 'num'
        int num = sc.nextInt();

        // Storing the original number for comparison later
        int actualNum = num;

        // Variable to store the reversed number
        int reverseNum = 0;

        // Loop to reverse the number
        while (num > 0) {
            // Extracting the last digit and adding it to reverseNum
            reverseNum = reverseNum * 10 + num % 10;

            // Removing the last digit from num
            num = num / 10;
        }

        // Checking if the original number and reversed number are the same
        if (actualNum == reverseNum) {
            // If true, it is a palindrome
            System.out.println(actualNum + "-> is a Palindrome Number");
        } else {
            // If false, it is not a palindrome
            System.out.println(actualNum + "-> is not a Palindrome Number");
        }
    }
}

/*
Step-by-Step Explanation of the Logic:
Taking User Input:

We use Scanner to take an integer input from the user.
Store the input in num.
Storing Original Number:

We store the original number in actualNum so that we can compare it later.
Reversing the Number:

We initialize reverseNum = 0 to store the reversed number.
We use a while loop to extract each digit from the number.
num % 10 extracts the last digit.
reverseNum = reverseNum * 10 + num % 10; adds the extracted digit to reverseNum.
num = num / 10; removes the last digit from num.
Checking for Palindrome:

If the reversed number (reverseNum) is equal to the original number (actualNum), it is a Palindrome.
Otherwise, it is not a Palindrome.
Example Test Cases & Output:
Test Case 1:
Input: 121
Output: 121 is a Palindrome Number

Test Case 2:
Input: 123
Output: 123 is not a Palindrome Number
 */