package ex6_ArraysPrograms_Part2;

import java.util.Arrays;
import java.util.Collections;

public class Assignment1_SortingInDescendingOrderUsingSortMethod {
    public static void main(String[] args) {
        //Sorting integer elements in descending order
        //Array should be Object Type and should be Same type of data. Hence instead of int we should use Integer
        Integer a[] ={12,65,87,12,98,33};
        System.out.println("Before sorting:" + Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("After sorting:" + Arrays.toString(a));

        //Sorting String elements in descending order
        String names[] = {"Sudhir", "Sushil", "Navin", "Avani", "Ishan", "Adhrita", "Ayan", "Vedika", "Ved" };
        System.out.println("Before sorting: "+Arrays.toString(names));
        Arrays.sort(names,Collections.reverseOrder());
        System.out.println("After sorting:"+Arrays.toString(names));
    }


}
