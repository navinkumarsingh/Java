// Package declaration - this class belongs to the package named 'ex3_LogicalOperator'
package Day03_LogicalOperator;

// Class declaration
public class Ex1_LogicalOperator {

    /*
     Logical Operators:
     - && (Logical AND): Returns true if both conditions are true.
     - || (Logical OR): Returns true if at least one condition is true.
     - !  (Logical NOT): Reverses the result of a condition.
    */

    // Main method - entry point of the Java program
    public static void main(String[] args) {

        // Declare and initialize integer variables
        int a = 7, b = 10, c = 15, d = 7, e = 20;

        // ---------------- Logical AND (&&) ----------------
        // (a > b) && (a > c) → (7 > 10) && (7 > 15) → false && false → false
        System.out.println((a > b) && (a > c)); // Output: false

        // a < b && b < c → (7 < 10) && (10 < 15) → true && true → true
        System.out.println(a < b && b < c); // Output: true

        // ---------------- Logical OR (||) ----------------
        // b > a || a > c → (10 > 7) || (7 > 15) → true || false → true
        System.out.println(b > a || a > c); // Output: true

        // a < b || a < c → (7 < 10) || (7 < 15) → true || true → true
        System.out.println(a < b || a < c); // Output: true

        // ---------------- Logical NOT (!) ----------------
        // !(b > a) → !(10 > 7) → !true → false
        System.out.println(!(b > a)); // Output: false

        // !(a > b) → !(7 > 10) → !false → true
        System.out.println(!(a > b)); // Output: true
    }
}
