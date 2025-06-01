package Day09_StringsPrograms;

public class Assignment5_CountNumOfWordsInString {
    public static void main(String[] args) {
        String str = "Hello World! This is a test string.";
        int wordCount = countWords(str);
        System.out.println("The number of words in the string is: " + wordCount);
    }

    // Method to count the number of words in a string
    public static int countWords(String str) {
        // Split the string by spaces and return the length of the resulting array
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
