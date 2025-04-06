package strings;

public class Assignment20_ConvertToTitleCase {
    public static void main(String[] args) {
        // Define the input string
        String str = "hello world! welcome to java programming.";

        // Call the method to convert to title case and store the result
        String result = toTitleCase(str);

        // Print the result
        System.out.println("Title case string: " + result);
    }

    // Method to convert a string to title case
    public static String toTitleCase(String str) {
        // Split the input string into words
        String[] words = str.split("\\s+");

        // StringBuilder to store the title case result
        StringBuilder titleCase = new StringBuilder();

        // Iterate over each word
        for (String word : words) {
            // If the word is not empty
            if (word.length() > 0) {
                // Capitalize the first letter and append the rest of the word in lowercase
                titleCase.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        // Return the result as a string, trimming any trailing spaces
        return titleCase.toString().trim();
    }
}