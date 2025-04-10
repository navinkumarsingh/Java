package ex7_strings;

public class Assignment13_StringCompression {
    public static void main(String[] args) {
        String str = "aabcccccaaa";
        String compressed = compressString(str);
        System.out.println("Compressed string: " + compressed);
    }

    // Method to compress a string using the counts of repeated characters
    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        compressed.append(str.charAt(str.length() - 1)).append(count);

        return compressed.length() < str.length() ? compressed.toString() : str;
    }
}