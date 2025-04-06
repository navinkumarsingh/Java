package strings;

public class Assignment4_CountOccurrencesOfACharacterInString {
    public static void main(String[] args) {
        String str = "Hello World! This is a test string.";
        char ch = 't';
        int count = countOccurrences(str, ch);
        System.out.println("The character '" + ch + "' occurs " + count + " times in the string.");
    }

    // Method to count occurrences of a character in a string
    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
