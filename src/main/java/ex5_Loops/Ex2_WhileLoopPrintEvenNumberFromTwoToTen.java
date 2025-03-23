package ex5_Loops;

public class Ex2_WhileLoopPrintEvenNumberFromTwoToTen {
    public static void main(String[] args) {
        int num = 2; // Initialize num with 2 (first even number)

        while (num <= 10) {  // Condition: Loop runs while num is less than or equal to 10
            System.out.print(num + " "); // Print the current value of num
            num += 2; // Increment num by 2 to get the next even number
        }
    }
}


/*
Explanation:
1. int num = 2;
Initializes num with 2, which is the first even number.
2. while (num <= 10) {
The loop continues executing as long as num is less than or equal to 10.
If num becomes greater than 10, the loop stops.
3. System.out.print(num + " ");
Prints the current value of num followed by a space (on the same line).
4. num += 2;
Increases num by 2 to move to the next even number.
Explanation:
num += 2; → ✅ Correct (Shorthand for num = num + 2;)
num=+2; → ❌ Incorrect (This just assigns +2 to num, not increments it.)
Output:
2 4 6 8 10
 */