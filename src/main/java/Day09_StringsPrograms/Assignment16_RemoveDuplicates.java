package Day09_StringsPrograms;
/* Remove Duplicates from a String: This program removes duplicate characters from a given string.
   It uses a boolean array to keep track of characters that have already been seen. As it iterates through
   the string, it appends characters to the result only if they haven't been seen before. */
public class Assignment16_RemoveDuplicates {
    public static void main(String[] args) {
        // Define the input string
        String str = "Hello World!";

        // Call the method to remove duplicates and store the result
        String result = removeDuplicates(str);

        // Print the result
        System.out.println("String after removing duplicates: " + result);
    }

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String str) {
        // StringBuilder to store the result without duplicates
        StringBuilder result = new StringBuilder();

        // Boolean array to keep track of seen characters (ASCII set)
        boolean[] seen = new boolean[256];

        // Iterate over each character in the input string
        for (char ch : str.toCharArray()) {
            // If the character has not been seen before
            if (!seen[ch]) {
                // Mark the character as seen
                seen[ch] = true;

                // Append the character to the result
                result.append(ch);
            }
        }
        // Return the result as a string
        return result.toString();
    }
}