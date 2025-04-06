package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment21_FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        // Define the input string
        String str = "swiss";

        // Call the method to find the first non-repeated character and store the result
        char result = findFirstNonRepeatedCharacter(str);

        // Print the result
        System.out.println("First non-repeated character: " + result);
    }

    // Method to find the first non-repeated character in a string
    public static char findFirstNonRepeatedCharacter(String str) {
        // LinkedHashMap to store character counts while maintaining insertion order
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Iterate over each character in the input string
        for (char ch : str.toCharArray()) {
            // Update the count of the character in the map
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Iterate over the entries in the map
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            // If the character count is 1, return the character
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // If no non-repeated character is found, throw an exception
        throw new RuntimeException("No non-repeated character found");
    }
}
