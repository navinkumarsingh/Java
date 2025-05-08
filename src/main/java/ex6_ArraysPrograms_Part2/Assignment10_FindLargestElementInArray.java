package ex6_ArraysPrograms_Part2;

//Motive: This program finds the maximum element in a given array.
public class Assignment10_FindLargestElementInArray {
    public static void main(String[] args) {
        // Define the input array
        int arr[] = {4, 2, 7, 1, 9};
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.println("Max Value is:" + maxValue);
    }
}









































































        /*// Call the method to find the maximum element and store the result
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
}*/