package ex6_ArraysPrograms;
//This program rotates an array to the right by a given number of positions.
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; // Number of positions to rotate
        int n = arr.length;

        // Normalize k to ensure it is within the bounds of the array length
        k = k % n;

        // Rotate the array
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        // Print the rotated array
        System.out.println("Rotated array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // Helper method to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
