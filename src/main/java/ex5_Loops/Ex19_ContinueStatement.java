package ex5_Loops; // Defines the package name (used for organizing classes)

public class Ex19_ContinueStatement { // Class definition
    public static void main(String[] args) { // Main method - execution starts here

        // 'for' loop starts from i = 1 and runs until i <= 10
        for(int i = 1; i <= 10; i++) {

            // If i equals 3, 5, or 9, the continue statement skips printing it
            if(i == 3 || i == 5 || i == 9) {
                continue; // Skips printing 3, 5, and 9 and moves to the next iteration
            }

            // Prints the value of i if it is not 3, 5, or 9
            System.out.println(i);
        }
    }
}

/*
Logic Used in the Program:

1. Using a for loop to iterate from 1 to 10:
   - The loop starts with i = 1 and increases by 1 each time (i++).
   - It runs until i <= 10.

2. Applying a continue statement:
   - When i is 3, 5, or 9, the `continue` statement is executed.
   - This skips the rest of the loop’s body for those values, meaning `System.out.println(i);` is not executed for them.
   - The loop then moves directly to the next iteration.

Expected Output:
1
2
4
6
7
8
10

(Note: 3, 5, and 9 are skipped.)

Logic Used in the Program:
Using a for loop to iterate from 1 to 10:

The loop starts with i = 1 and increases by 1 each time (i++).
It runs until i <= 10.
Applying a continue statement:

When i == 5, the continue statement is executed.
This skips the rest of the loop’s body for i = 5, meaning System.out.println(i); is not executed for i = 5.
The loop then moves to the next iteration.
 */