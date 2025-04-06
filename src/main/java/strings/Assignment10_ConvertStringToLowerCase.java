package strings;

public class Assignment10_ConvertStringToLowerCase {
    public static void main(String[] args) {
        String str = "Hello World!";
        String lowerCaseStr = convertToLowerCase(str);
        System.out.println("Original String: " + str);
        System.out.println("String in lower case: " + lowerCaseStr);
    }

    // Method to convert a string to lower case
    public static String convertToLowerCase(String str) {
        return str.toLowerCase();
    }
}