package ex5_Loops; // Defines the package name (used for organizing classes)

public class Ex18_BreakUnreachableStatement { // Class definition
    public static void main(String[] args) { // Main method - execution starts here

        // 'for' loop starts from i = 1 and runs until i <= 10
        for (int i = 1; i <= 10; i++) {

            // If i equals 5, the break statement stops the loop
            if(i == 5) {
                break; // Exits the loop immediately when i == 5

                // System.out.println(i); // This statement is unreachable and will cause an error
                // Any statement after 'break' inside the same block is unreachable.
            }

            // Prints the value of i if it hasn't reached 5
            System.out.println(i);
        }
    }
}
