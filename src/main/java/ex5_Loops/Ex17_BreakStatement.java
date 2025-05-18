package ex5_Loops; // Package name (optional)

public class Ex17_BreakStatement { // Class definition
    public static void main(String[] args) { // Main method - program execution starts here

        // 'for' loop starting from i = 1 and running up to i <= 10
        for(int i = 1; i <= 10; i++) {

            // Check if i is equal to 5
            if(i == 5) {
                // If i is 5, break terminates the loop immediately
                break; // Exit the loop here
            }

            // Print the current value of i
            System.out.println(i);
        }
    }
}

/*
How This Code Works:
1. The loop initializes i to 1 and runs as long as i is less than or equal to 10.
2. Each iteration prints the current value of i.
3. When i becomes 5, the 'if' condition is true and the break statement executes.
4. 'break' immediately exits the loop, so numbers after 4 are not printed.
5. Therefore, output is:
   1
   2
   3
   4
*/
