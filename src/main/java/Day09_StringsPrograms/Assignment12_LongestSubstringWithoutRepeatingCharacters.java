package Day09_StringsPrograms;

import java.util.HashSet;
import java.util.Set;

public class Assignment12_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "abcabcbb";
        String longestSubstring = findLongestSubstring(str);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
    }

    // Method to find the longest substring without repeating characters
    public static String findLongestSubstring(String str) {
        int n = str.length();
        int maxLength = 0;
        int start = 0;
        String longestSubstring = "";
        Set<Character> set = new HashSet<>();

        for (int end = 0; end < n; end++) {
            while (set.contains(str.charAt(end))) {
                set.remove(str.charAt(start));
                start++;
            }
            set.add(str.charAt(end));
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                longestSubstring = str.substring(start, end + 1);
            }
        }
        return longestSubstring;
    }
}