package ex7_strings;

import java.util.Arrays;

public class Ex5_MutableVsImmutable {
    public static void main(String[] args) {

        // ----------------- MUTABLE EXAMPLE (can be changed) -----------------

        // Arrays in Java are mutable, meaning you can modify their contents
        int a[] = {20, 10, 40, 50, 30};

        // Print the original array
        System.out.println(Arrays.toString(a)); // Output: [20, 10, 40, 50, 30]

        // Sort the array using Arrays.sort() - this modifies the original array
        Arrays.sort(a);

        // Print the sorted array - the original array has changed (mutated)
        System.out.println(Arrays.toString(a)); // Output: [10, 20, 30, 40, 50]

        // ----------------- IMMUTABLE EXAMPLE (cannot be changed) -----------------

        // Strings in Java are immutable, meaning you can't change the original string
        String s = new String("welcome");

        // Print the original string
        System.out.println(s); // Output: welcome

        // Try to "add" text to the string using concat()
        // This does NOT change the original string — it creates a **new** one
        String concatString = s.concat(" to java");

        // Print the new string (result of concatenation)
        System.out.println(concatString); // Output: welcome to java

        // The original string `s` is still "welcome"
        System.out.println(s); // Output: welcome
    }
}

