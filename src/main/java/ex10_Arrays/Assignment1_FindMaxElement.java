package ex10_Arrays;
//Motive: This program finds the maximum element in a given array.
public class Assignment1_FindMaxElement {
    public static void main(String[] args) {
        // Define the input array
        int[] arr = {10, 20, 30, 40, 50};

        // Call the method to find the maximum element and store the result
        int max = findMaxElement(arr);

        // Print the result
        System.out.println("Maximum element in the array: " + max);
    }

    // Method to find the maximum element in an array
    public static int findMaxElement(int[] arr) {
        // Initialize the maximum element with the first element of the array
        int max = arr[0];

        // Iterate over each element in the array
        for (int i = 1; i < arr.length; i++) {
            // Update the maximum element if the current element is greater
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // Return the maximum element
        return max;
    }
}