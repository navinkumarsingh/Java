package Day05_Loops; // Defines the package name to organize related classes together

public class Ex18_BreakUnreachableStatement { // Declares a public class named Ex18_BreakUnreachableStatement
    public static void main(String[] args) { // Main method where the program execution starts

        // 'for' loop that starts with i=1 and repeats until i becomes greater than 10
        // After each loop, i is increased by 1 (i++)
        for (int i = 1; i <= 10; i++) {

            // Checks if the current value of i is equal to 5
            if(i == 5) {
                break; // Stops the entire loop immediately when i equals 5
                // Any code placed after 'break' inside this block will never run (unreachable)
                // For example, the below print statement if uncommented will cause a compile-time error:
                // System.out.println(i);
            }

            // Prints the current value of i to the console, only if the loop has not been stopped by break
            System.out.println(i);
        }
    }
}
