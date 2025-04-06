package ex10_Arrays;

import java.util.HashSet;
public class Assignment9_IntersectionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        // Add elements of arr1 to set1
        for (int i : arr1) {
            set1.add(i);
        }

        // Find intersection with arr2
        for (int i : arr2) {
            if (set1.contains(i)) {
                intersection.add(i);
            }
        }

        // Print the intersection
        System.out.println("Intersection of arrays: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
}
