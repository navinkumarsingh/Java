package ex6_ArraysPrograms_Part2;
//Motive: This program finds the second largest element in a given array.
public class Assignment4_FindSecondLargest {
    public static void main(String[] args) {
        // Define the input array
        int[] arr = {10, 20, 30, 40, 50};

        // Call the method to find the second largest element and store the result
        int secondLargest = findSecondLargest(arr);

        // Print the result
        System.out.println("Second largest element in the array: " + secondLargest);
    }

    // Method to find the second largest element in an array
    public static int findSecondLargest(int[] arr) {
        // Initialize the largest and second largest elements
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Iterate over each element in the array
        for (int num : arr) {
            // Update the largest and second largest elements accordingly
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        // Return the second largest element
        return secondLargest;
    }
}