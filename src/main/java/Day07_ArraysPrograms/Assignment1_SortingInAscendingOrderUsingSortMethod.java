package Day07_ArraysPrograms;

import java.util.Arrays;

public class Assignment1_SortingInAscendingOrderUsingSortMethod {
    public static void main(String[] args) {

        //Sorting integer elements in ascending order
        int numbers[] = {2, 1, 53, 5, 9, 2, 4};
        System.out.println("Before sorting :" + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("After sorting :" + Arrays.toString(numbers));

        //Sorting String elements in ascending order
        String names[] = {"Sudhir", "Sushil", "Navin", "Avani", "Ishan", "Adhrita", "Ayan", "Vedika", "Ved" };
        System.out.println("String elements Before Sorting :" + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("String elements After Sorting :" + Arrays.toString(names));

        //Sorting Object Type - Not Possible :Exception in thread "main" java.lang.ClassCastException
        Object ob[] = new Object[6];
        ob[0] = 1;
        ob[1] = "Navin";
        ob[2] = 10.4;
        ob[3] = null;
        ob[4] = 'A';
        ob[5]= false;

        System.out.println("Object elements before sorting:" +Arrays.toString(ob));
        Arrays.sort(ob);
        System.out.println("Object elements after sorting:" +Arrays.toString(ob));
    }
}
