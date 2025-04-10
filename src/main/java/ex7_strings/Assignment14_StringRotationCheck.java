package ex7_strings;

public class Assignment14_StringRotationCheck {
    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        boolean isRotation = checkRotation(str1, str2);
        System.out.println("Is the second string a rotation of the first? " + isRotation);
    }

    // Method to check if one string is a rotation of another
    public static boolean checkRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }
}