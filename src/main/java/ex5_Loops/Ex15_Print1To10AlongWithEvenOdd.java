package ex5_Loops; // Package name (used to organize classes, not mandatory for basic programs)

import java.util.Scanner;

public class Ex15_Print1To10AlongWithEvenOdd { // Class definition
    public static void main(String[] args) { // Main method - program execution starts here
        // A 'for' loop that starts from i = 1 and runs until i <= 10
        for (int i = 1; i <= 10; i++) {

            // Checks if 'i' is even
            if (i % 2 == 0) {
                System.out.println(i + " Even"); // Prints 'i' followed by "Even"
            }
            else {
                System.out.println(i + " Odd"); // Prints 'i' followed by "Odd"
            }
        }
    }
}
