package Day08_Strings;

public class Ex7_StringComparison {
    public static void main(String[] args) {

        // ----------- Case 1: Comparing string literals -----------

        // Both s1 and s2 are string literals, created without 'new'
        String s1 = "welcome";
        String s2 = "welcome";

        // Java uses "String Pool" to store literals.
        // Since s1 and s2 have the same value, they point to the same memory location.
        System.out.println(s1 == s2);         // true -> comparing references (same object)
        System.out.println(s1.equals(s2));    // true -> comparing actual string content

        // ----------- Case 2: Strings created using 'new' keyword -----------

        // These are two different objects with same content
        String s3 = new String("welcome");
        String s4 = new String("welcome");

        // Each 'new' creates a new object in heap memory
        System.out.println(s3 == s4);         // false -> different memory locations
        System.out.println(s3.equals(s4));    // true -> same content

        // ----------- Case 3: One literal and one 'new' object -----------

        String s5 = "abc";                   // string literal (from pool)
        String s6 = new String("abc");       // new object in heap

        System.out.println(s5 == s6);         // false -> different locations
        System.out.println(s5.equals(s6));    // true -> same content

        // ----------- Case 4: Assigning one object to another -----------

        String s7 = "abc";                   // string literal
        String s8 = new String("abc");       // new object
        String s9 = s8;                      // s9 refers to the same object as s8

        System.out.println(s7 == s8);         // false -> literal vs new object
        System.out.println(s7.equals(s8));    // true -> same content
        System.out.println(s8 == s9);         // true -> same object reference
        System.out.println(s8.equals(s9));    // true -> same content
        System.out.println(s7 == s8);         // false again
        System.out.println(s7.equals(s9));    // true -> same value
    }
}
