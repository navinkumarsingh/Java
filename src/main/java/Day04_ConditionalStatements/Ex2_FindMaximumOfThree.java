package Day04_ConditionalStatements;

// Class to find the maximum among three numbers
public class Ex2_FindMaximumOfThree {

    public static void main(String args[]) {
        // Declare and initialize three integer variables
        int a = 5, b = 1, c = 6;

        // Check if 'a' is greater than both 'b' and 'c'
        if (a > b && a > c) {
            System.out.println("A is the Greatest");
        }
        // If 'a' is not the greatest, check if 'b' is greater than 'c'
        else if (b > c) {
            System.out.println("B is the Greatest");
        }
        // If neither 'a' nor 'b' is the greatest, then 'c' must be the greatest
        else {
            System.out.println("C is the Greatest");
        }
    }
}