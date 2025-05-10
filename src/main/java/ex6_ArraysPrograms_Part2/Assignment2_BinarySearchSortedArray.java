// Package name where this class is stored
package ex6_ArraysPrograms_Part2;
// Importing Arrays class to use built-in binarySearch method
import java.util.Arrays;
/*
What is Binary Search?
Binary Search is a fast way to find an element in a sorted array. It works by repeatedly dividing the
search space in half, which is much quicker than checking each element one by one.
 */
// This is the main class of the program
public class Assignment2_BinarySearchSortedArray {

    // The main method - starting point of any Java program
    public static void main(String[] args) {

        // Declare and initialize a sorted array of integers
        // Binary Search only works correctly with sorted arrays
        int a[] = {12, 13, 14, 15, 16, 17};

        // This is the value we are searching for in the array
        int searchedElement = 15;

        // Use Java's built-in binarySearch method to find the element
        // It returns the index if found, or a negative number if not found
        int index = Arrays.binarySearch(a, searchedElement);

        // Check if the element was found (index will be 0 or greater)
        if(index >= 0)
        {
            // If found, print the index of the element
            System.out.println("Element found at index: " + index);
        }
        else
        {
            // If not found, print this message
            System.out.println("Element not found");
        }
    }
}
