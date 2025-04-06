package strings;

public class Assignment1_StringIsPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = true;

        // Check if the string is a palindrome
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print the result
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
