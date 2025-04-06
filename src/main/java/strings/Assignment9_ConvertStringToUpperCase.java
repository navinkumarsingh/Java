package strings;

public class Assignment9_ConvertStringToUpperCase {
    public static void main(String[] args) {
        String str = "Hello World!";
        String upperCaseStr = convertToUpperCase(str);
        System.out.println("Original String: " + str);
        System.out.println("String in upper case: " + upperCaseStr);
    }

    // Method to convert a string to upper case
    public static String convertToUpperCase(String str) {
        return str.toUpperCase();
    }
}