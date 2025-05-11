package ex6_ArraysPrograms;

import java.util.Arrays;

public class Assignment3_CopyingArray {
    public static void main(String[] args) {
        int[] originalArray = {1,2,3,4,5};
        //Method 1 = Using for loop
        int copiedArray[] = new int[originalArray.length];
        for(int i=0;i<originalArray.length;i++)
        {
          copiedArray[i] = originalArray[i];
        }
        System.out.println("Original array data: "+ Arrays.toString(originalArray));
        System.out.println("Copied array data: "+ Arrays.toString(copiedArray));

        //Method 2: Using built in method Arrays.copyOf()
        int copiedArray1[] = Arrays.copyOf(originalArray,originalArray.length);
        System.out.println("Copied array data: "+ Arrays.toString(copiedArray1));

        //Method 3: Using System.arraycopy()
        int copiedArray2[] = new int[originalArray.length];
        System.arraycopy(originalArray, 0 , copiedArray2, 0, originalArray.length );
        System.out.println("Copied Array data: "+Arrays.toString(copiedArray2));

        //Method 4: Using clone()
        int copiedArray3[] = originalArray.clone();
        System.out.println("Copied Array data: " + Arrays.toString(copiedArray3));
    }
}
