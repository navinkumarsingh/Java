package ex6_Arrays_Part1;
//This program finds the missing number in an array of consecutive numbers.
public class Assignment10_MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length + 1; // Total number of elements including the missing one

        // Calculate the expected sum of the first n natural numbers
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum of the array elements
        int actualSum = 0;
        for (int i : arr) {
            actualSum += i;
        }

        // The missing number is the difference between the expected sum and the actual sum
        int missingNumber = expectedSum - actualSum;

        // Print the missing number
        System.out.println("Missing number: " + missingNumber);
    }
}