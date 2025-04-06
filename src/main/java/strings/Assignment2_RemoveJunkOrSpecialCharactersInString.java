package strings;

public class Assignment2_RemoveJunkOrSpecialCharactersInString {
    public static void main(String[] args) {
        String str = "Hello!@#$%^&*() World123";
        String result = removeSpecialCharacters(str);
        System.out.println("Original String: " + str);
        System.out.println("String after removing special characters: " + result);
    }

    // Method to remove special characters from a string
    public static String removeSpecialCharacters(String str) {
        // Use regex to replace all non-alphanumeric characters with an empty string
        return str.replaceAll("[^a-zA-Z0-9]", "");
    }
}
