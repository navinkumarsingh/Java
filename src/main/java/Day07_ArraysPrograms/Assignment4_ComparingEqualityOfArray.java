package Day07_ArraysPrograms;

import java.util.Arrays;

public class Assignment4_ComparingEqualityOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int[] arr3 = {1, 2, 3, 4, 5, 7};

        //Method1: Using Arrays.equal()
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr3));

        //Method2: Using loop
        boolean result = true;
        if (arr1.length != arr2.length) {
            result = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    result = false;
                }

            }
        }

        System.out.println("Are arr1 and arr2 are equal?: " + result);

    }
}
