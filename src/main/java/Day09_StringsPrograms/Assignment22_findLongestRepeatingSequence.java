package Day09_StringsPrograms;

public class Assignment22_findLongestRepeatingSequence {
        public static String findLongestRepeatingSequence(String input) {
            if (input == null || input.isEmpty()) {
                return "";
            }

            char maxChar = input.charAt(0);
            int maxCount = 1;

            char currentChar = input.charAt(0);
            int currentCount = 1;

            for (int i = 1; i < input.length(); i++) {
                char ch = input.charAt(i);

                if (ch == currentChar) {
                    currentCount++;
                } else {
                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                        maxChar = currentChar;
                    }
                    currentChar = ch;
                    currentCount = 1;
                }
            }

            // Final check for the last sequence
            if (currentCount > maxCount) {
                maxChar = currentChar;
                maxCount = currentCount;
            }

            return String.valueOf(maxChar).repeat(maxCount);
        }

        public static void main(String[] args) {
            String input = "aabbbccccdddddeeeee";
            String result = findLongestRepeatingSequence(input);
            System.out.println("Output: " + result);  // Output: ddddd
        }
    }

