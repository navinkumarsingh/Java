package Day09_StringsPrograms;

import java.util.ArrayList;
import java.util.List;

public class Assignment17_FindAllSubstrings {
    public static void main(String[] args) {
        String str = "abc";
        List<String> substrings = findAllSubstrings(str);
        System.out.println("All substrings of the string are: " + substrings);
    }

    // Method to find all substrings of a given string
    public static List<String> findAllSubstrings(String str) {
        List<String> substrings = new ArrayList<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                substrings.add(str.substring(i, j));
            }
        }
        return substrings;
    }
}