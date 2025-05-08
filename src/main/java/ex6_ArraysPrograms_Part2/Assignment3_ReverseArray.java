package ex6_ArraysPrograms_Part2;
//Motive: This program reverses the elements of a given array.
public class Assignment3_ReverseArray {
    public static void main(String[] args) {
        // Define the input array
        int[] arr = {10, 20, 30, 40, 50};

        // Call the method to reverse the array
        reverseArray(arr);

        // Print the reversed array
        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Method to reverse an array
    public static void reverseArray(int[] arr) {
        // Initialize two pointers, one at the start and one at the end of the array
        int start = 0;
        int end = arr.length - 1;

        // Swap the elements at the start and end pointers until they meet in the middle
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}