package Day09_StringsPrograms;

public class Assignment18_StringToIntegerConversion {
    public static void main(String[] args) {
        String str = "12345";
        int number = stringToInteger(str);
        System.out.println("Converted integer: " + number);
    }

    // Method to convert a string to an integer (similar to atoi in C)
    public static int stringToInteger(String str) {
        int result = 0;
        int sign = 1;
        int i = 0;

        if (str.charAt(0) == '-') {
            sign = -1;
            i++;
        }

        for (; i < str.length(); i++) {
            result = result * 10 + (str.charAt(i) - '0');
        }
        return result * sign;
    }
}