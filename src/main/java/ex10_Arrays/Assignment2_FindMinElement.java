package ex10_Arrays;

//Motive: This program finds the minimum element in a given array.
public class Assignment2_FindMinElement {
    public static void main(String[] args) {
        // Define the input array
        int[] arr = {10, 20, 30, 40, 50};

        // Call the method to find the minimum element and store the result
        int min = findMinElement(arr);

        // Print the result
        System.out.println("Minimum element in the array: " + min);
    }

    // Method to find the minimum element in an array
    public static int findMinElement(int[] arr) {
        // Initialize the minimum element with the first element of the array
        int min = arr[0];

        // Iterate over each element in the array
        for (int i = 1; i < arr.length; i++) {
            // Update the minimum element if the current element is smaller
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        // Return the minimum element
        return min;
    }
}