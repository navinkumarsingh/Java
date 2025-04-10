package ex7_strings;

import java.util.Arrays;

public class Ex1_StringMethods {
    public static void main(String[] args) {

        // ----------- A1_String Declaration -----------

        // Approach 1 - Direct assignment
        // A1_String s = "Welcome";

        // Approach 2 - Using new keyword (less preferred for simple cases)
        // A1_String str = new A1_String("Welcome");

        // ----------- charAt() method -----------
        String s = "welcome";
        System.out.println(s.charAt(3)); // Output: 'c'
        System.out.println(s.charAt(0)); // Output: 'w'

        // ----------- concat() method -----------
        String s1 = "Welcome";
        String s2 = "to java";
        String s3 = "automation";

        System.out.println(s1.concat(s2)); // Output: Welcometo java
        System.out.println(s1.concat(s2).concat(s3)); // Chained: Welcometo javaautomation
        System.out.println(s1.concat(s2 + s3)); // Using + inside concat

        // ----------- contains() method -----------
        s = "welcome";
        System.out.println(s.contains("wel")); // true
        System.out.println(s.contains("Wel")); // false (case-sensitive)

        // ----------- endsWith() method -----------
        s = "report.html";
        System.out.println(s.endsWith(".html")); // true
        System.out.println(s.endsWith(".pdf")); // false

        // ----------- equals() and equalsIgnoreCase() methods -----------
        s1 = "Welcome";
        s2 = "welcome";

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2)); // true

        // ----------- indexOf() method -----------
        s = "selenium automation selenium testing";
        System.out.println(s.indexOf("selenium")); // 0
        System.out.println(s.indexOf("automation")); // 9
        System.out.println(s.indexOf("xyz")); // -1 (not found)

        // ----------- isEmpty() method -----------
        String emptyStr = "";
        System.out.println(emptyStr.isEmpty()); // true
        System.out.println("Java".isEmpty()); // false

        // ----------- lastIndexOf() method -----------
        System.out.println(s.lastIndexOf("selenium")); // 20

        // ----------- length() method -----------
        s = "Welcome";
        System.out.println(s.length()); // 7

        // ----------- matches() method (regex) -----------
        String email = "abc123@gmail.com";
        System.out.println(email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}")); // true

        // ----------- replace() method -----------
        s = "welcome to selenium java selenium python selenium c#";
        System.out.println(s.replace('e', 'x')); // Replace character
        System.out.println(s.replace("selenium", "playwright")); // Replace word

        // ----------- split() method -----------
        s = "abcdef@gmail.com";
        String a[] = s.split("@");
        System.out.println(Arrays.toString(a)); // [abcdef, gmail.com]

        // ----------- startsWith() method -----------
        s = "TestNG";
        System.out.println(s.startsWith("Test")); // true
        System.out.println(s.startsWith("NG")); // false

        // ----------- substring() method -----------
        s = "selenium";
        System.out.println(s.substring(1, 5)); // elen
        System.out.println(s.substring(0, 3)); // sel

        // ----------- toLowerCase() and toUpperCase() methods -----------
        s = "WeLCome";
        System.out.println(s.toLowerCase()); // welcome
        System.out.println(s.toUpperCase()); // WELCOME

        // ----------- trim() method -----------
        String s4 = "   welcome   ";
        System.out.println("Before trim length: " + s4.length()); // includes spaces
        System.out.println("After trim length: " + s4.trim().length()); // trimmed

        // ----------- Practical Examples -----------

        // Clean a price string
        String amount = "$ 15,20,55";
        System.out.println(amount.replace("$", "")); // remove $
        System.out.println(amount.replace("$", "").replace(",", "")); // 152055

        // Split with nested delimiters
        s = "abc,123@xyz";
        String arr1[] = s.split(",");
        String arr2[] = arr1[1].split("@");

        System.out.println(Arrays.toString(arr1)); // [abc, 123@xyz]
        System.out.println(Arrays.toString(arr2)); // [123, xyz]
        System.out.println(arr1[0]); // abc
        System.out.println(arr2[0]); // 123
        System.out.println(arr2[1]); // xyz

        // Split by space
        s = "abc 123 xyz";
        String ar[] = s.split(" ");
        System.out.println(Arrays.toString(ar)); // [abc, 123, xyz]

        // Case-insensitive contains
        String name = "John Kenedy";
        System.out.println(name.contains("john")); // false
        System.out.println(name.toLowerCase().contains("john")); // true
    }
}