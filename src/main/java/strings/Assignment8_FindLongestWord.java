package strings;

public class Assignment8_FindLongestWord {
    public static void main(String[] args) {
        String str = "Hello World! This is a test string.";
        String longestWord = findLongestWord(str);
        System.out.println("The longest word in the string is: " + longestWord);
    }

    // Method to find the longest word in a string
    public static String findLongestWord(String str) {
        String[] words = str.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}