package strings;

public class Assignment3_RemoveWhiteSpacesInString {
    public static void main(String[] args) {
        String str = "Hello World! This is a test string.";
        String result = removeWhiteSpaces(str);
        System.out.println("Original String: " + str);
        System.out.println("String after removing white spaces: " + result);
    }

    // Method to remove white spaces from a string
    public static String removeWhiteSpaces(String str) {
        // Use regex to replace all white spaces with an empty string
        return str.replaceAll("\\s+", "");
    }
}
