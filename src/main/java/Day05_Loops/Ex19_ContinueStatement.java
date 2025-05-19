package Day05_Loops; // Defines the package name to organize classes into a folder-like structure

public class Ex19_ContinueStatement { // Declares a public class named Ex19_ContinueStatement
    public static void main(String[] args) { // Main method where the program execution starts

        // 'for' loop starts with i=1 and runs until i is less than or equal to 10
        // After each loop, i increases by 1 (i++)
        for(int i = 1; i <= 10; i++) {

            // Checks if i is equal to 3, 5, or 9
            if(i == 3 || i == 5 || i == 9) {
                continue; // Skips the remaining statements in this loop iteration and jumps to the next iteration
            }

            // Prints the current value of i if it is NOT 3, 5, or 9
            System.out.println(i);
        }
    }
}

/*
Step-by-step logic:

1. The for loop runs from 1 to 10.
2. For each value of i, the if condition checks if i is 3, 5, or 9.
3. If the condition is true (i is 3, 5, or 9), the continue statement causes the program
   to skip the printing line and move directly to the next iteration of the loop.
4. For all other values, the current value of i is printed.
5. As a result, the numbers 3, 5, and 9 are not printed.

Expected output:
1
2
4
6
7
8
10

(Note: 3, 5, and 9 are skipped due to the continue statement.)
*/
