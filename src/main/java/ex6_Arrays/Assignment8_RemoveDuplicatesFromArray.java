package ex6_Arrays;

import java.util.HashSet;
//This program removes duplicate elements from an array.
public class Assignment8_RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        HashSet<Integer> set = new HashSet<>();

        // Add elements to the set to remove duplicates
        for (int i : arr) {
            set.add(i);
        }

        // Print the array without duplicates
        System.out.println("Array without duplicates: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
