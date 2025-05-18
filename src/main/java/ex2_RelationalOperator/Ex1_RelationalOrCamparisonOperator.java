// Package declaration: This file belongs to the package named 'ex2_RelationalOperator'
package ex2_RelationalOperator;

/*
This program demonstrates:
- Relational Operators: >, <, >=, <=, ==, !=
  → These operators compare two values and return a boolean result (true/false).
- Logical Operators: && (AND), || (OR), ! (NOT)
  → These combine multiple conditions and also return true/false.
*/

public class Ex1_RelationalOrCamparisonOperator {
    public static void main(String[] args) {

        // Declaring and initializing integer variables
        int a = 7, b = 10, c = 15, d = 7, e = 20;

        // Declaring and initializing float variables
        float f = 1.2f, g = 2.2f;

        // Declaring String variables
        String s = null;          // Null value
        String s1 = "Navin";      // String literal
        String s2 = "Navin";      // Same value as s1 (interned in memory)

        // ------------------- Relational Operators -------------------

        // > (Greater than)
        System.out.println(f > g); // false → 1.2 is not greater than 2.2

        // > (Greater than)
        System.out.println(b > c); // false → 10 is not greater than 15
        System.out.println(c > d); // true  → 15 is greater than 7

        // < (Less than)
        System.out.println(c < b); // false → 15 is not less than 10
        System.out.println(b < c); // true  → 10 is less than 15

        // >= (Greater than or equal to)
        System.out.println(b >= e); // false → 10 is not greater than or equal to 20
        System.out.println(a >= d); // true  → 7 is equal to 7

        // <= (Less than or equal to)
        System.out.println(c <= b); // false → 15 is not less than or equal to 10
        System.out.println(b <= c); // true  → 10 is less than 15

        // == (Equal to)
        System.out.println(a == b); // false → 7 is not equal to 10
        System.out.println(a == d); // true  → 7 is equal to 7

        // != (Not equal to)
        System.out.println(a != d); // false → 7 is equal to 7
        System.out.println(a != c); // true  → 7 is not equal to 15

        // ------------------- Logical Operators -------------------

        // && (Logical AND) → returns true only if both conditions are true
        System.out.println((a > b) && (a > c)); // false && false → false
        System.out.println(a < b && b < c);     // true && true  → true

        // || (Logical OR) → returns true if at least one condition is true
        System.out.println(b > a || a > c); // true || false → true
        System.out.println(a < b || a < c); // true || true  → true

        // ! (Logical NOT) → reverses the boolean value
        System.out.println(!(b > a)); // !(true) → false
        System.out.println(!(a > b)); // !(false) → true
    }
}
