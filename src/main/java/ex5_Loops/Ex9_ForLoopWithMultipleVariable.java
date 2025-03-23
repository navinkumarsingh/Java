package ex5_Loops;  // Package name where this class belongs

public class Ex9_ForLoopWithMultipleVariable {  // Class definition
    // In this loop, 'i' increases linearly (by 1) and 'j' grows exponentially (multiplied by 2)
    public static void main(String[] args) {  // Main method where execution starts

        // 'for' loop with multiple variables: 'i' starts from 0, 'j' starts from 1
        // Loop runs while 'i' is less than or equal to 10
        // In each iteration: 'i' increases by 1, and 'j' is multiplied by 2
        for(int i = 0, j = 1; i <= 10; i++, j = j * 2) {

            // Prints the values of 'i' and 'j' in each iteration
            System.out.println(i + " " + j);
        }
    }
}
