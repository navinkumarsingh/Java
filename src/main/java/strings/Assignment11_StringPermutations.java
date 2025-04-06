package strings;

import java.util.ArrayList;
import java.util.List;

public class Assignment11_StringPermutations {
    public static void main(String[] args) {
        String str = "abc";
        List<String> permutations = generatePermutations(str);
        System.out.println("Permutations of the string are: " + permutations);
    }

    // Method to generate all permutations of a string
    public static List<String> generatePermutations(String str) {
        List<String> result = new ArrayList<>();
        permute(str, 0, str.length() - 1, result);
        return result;
    }

    private static void permute(String str, int l, int r, List<String> result) {
        if (l == r) {
            result.add(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r, result);
                str = swap(str, l, i); // backtrack
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}