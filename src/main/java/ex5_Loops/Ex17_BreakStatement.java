package ex5_Loops; // Package name (used to organize classes, not mandatory for basic programs)

public class Ex17_BreakStatement { // Class definition
    public static void main(String[] args) { // Main method - program execution starts here

        // A 'for' loop that starts from i = 0 and runs until i <= 10
        for(int i = 1; i <= 10; i++) {

            //Based on the condition, i.e. If i reaches 5, the break statement stops the loop immediately
            if(i == 5) {
                break; // Exits the loop
            }

            // Prints the value of i
            System.out.println(i);
        }
    }
}

/*
How This Code Works:
1. The loop starts with i = 0 and increments by 1 each time (i++).
2. When i == 5, the break statement stops the loop.
3. As a result, only numbers 0, 1, 2, 3, 4 are printed, and the loop exits.
*/
