package Day05_Loops;  // This line defines the package where this class is stored

public class Ex9_ForLoopWithMultipleVariable {  // Start of the class named Ex9_ForLoopWithMultipleVariable

    // This main method is the starting point of the program
    // It contains a 'for' loop that uses two variables, 'i' and 'j'
    public static void main(String[] args) {

        // For loop initialization:
        // i starts at 0 (will increase by 1 each time)
        // j starts at 1 (will double each time by multiplying by 2)
        // Loop will keep running as long as i is less than or equal to 10
        for(int i = 0, j = 1; i <= 10; i++, j = j * 2) {

            // Print the current values of i and j separated by a space
            // This shows how i increases slowly (by 1) and j grows faster (powers of 2)
            System.out.println(i + " " + j);
        }
    }
}
