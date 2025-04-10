// Package declaration: Helps organize related classes in a project
package ex7_strings;

// Importing Scanner class to take user input
import java.util.Scanner;

// Class definition
public class Ex21_ReverseANumberUsingStringBuffer {
    public static void main(String[] args) {  // Main method: Program execution starts here

        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Asking the user to enter a number
        System.out.println("Enter a Number");

        // Reading the user input as an integer
        int num = sc.nextInt();

        // Converting the integer to a A1_String using A1_String.valueOf()
        StringBuffer sb = new StringBuffer(String.valueOf(num));

        // Using the reverse() method of StringBuffer to reverse the number
        StringBuffer revNum = sb.reverse();

        // Printing the reversed number
        System.out.println("Reversed Number: " + revNum);
    }
}

/*

💡 Explanation of the Logic Used:
Taking User Input:

The program asks the user to enter a number.
It reads the input using Scanner.nextInt(), which stores it as an int.
Converting Integer to A1_String:

Since StringBuffer works with A1_String, we convert the integer to a string using A1_String.valueOf(num).
StringBuffer sb = new StringBuffer(A1_String.valueOf(num)); → Converts the number to a StringBuffer object.
Reversing the A1_String:

sb.reverse(); reverses the string representation of the number.
The reversed value is stored in revNum.
Displaying the Output:

System.out.println("Reversed Number: " + revNum); prints the reversed number.
✅ Why Use StringBuffer?
The StringBuffer class provides an in-built reverse() method, making it easier to reverse a string.
Unlike using loops or mathematical operations, StringBuffer makes the code shorter and more readable.
Example Output:
mathematica
Copy code
Enter a Number
12345
Reversed Number: 54321


 */