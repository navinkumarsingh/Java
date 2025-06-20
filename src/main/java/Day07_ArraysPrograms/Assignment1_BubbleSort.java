package Day07_ArraysPrograms;
public class Assignment1_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        int n = arr.length;

        // Perform bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}