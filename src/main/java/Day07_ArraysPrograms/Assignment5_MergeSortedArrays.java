package Day07_ArraysPrograms;

//Motive: This program merges two sorted arrays into a single sorted array.
public class Assignment5_MergeSortedArrays {
    public static void main(String[] args) {
        // Define the input arrays
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        // Call the method to merge the sorted arrays and store the result
        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        // Print the merged sorted array
        System.out.print("Merged sorted array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    // Method to merge two sorted arrays into a single sorted array
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        // Initialize the result array
        int[] result = new int[arr1.length + arr2.length];

        // Initialize pointers for arr1, arr2, and result
        int i = 0, j = 0, k = 0;

        // Merge the arrays until one of them is exhausted
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // Copy the remaining elements of arr1, if any
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        // Copy the remaining elements of arr2, if any
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        // Return the merged sorted array
        return result;
    }
}