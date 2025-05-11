// This line defines the package where the current class is located
package ex6_ArraysPrograms;

// Importing the Arrays class so we can use utility methods like sort() and binarySearch()
import java.util.Arrays;

// Start of the main class
public class Assignment2_BinarySearchUnsortedArray {

    // Main method - entry point of the Java program
    public static void main(String[] args) {

        // Declare and initialize an unsorted array of integers
        int arr[] = {10, 18, 19, 11, 12, 14}; // This array is NOT sorted

        // Before using binarySearch, we must sort the array in ascending order
        Arrays.sort(arr); // Now the array becomes: {10, 11, 12, 14, 18, 19}

        // The value we want to search for in the array
        int searchedElement = 14;

        // Use binarySearch to find the index of the searched element in the sorted array
        int index = Arrays.binarySearch(arr, searchedElement);

        // Check if the index is non-negative (element found)
        if (index >= 0)
        {
            // If found, print the index at which the element is located
            System.out.println("Element found at index: " + index);
        }
        else
        {
            // If not found (index is negative), print that the element was not found
            System.out.println("Element not found");
        }
    }
}
