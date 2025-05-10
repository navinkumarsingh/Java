package ex6_ArraysPrograms_Part2;

public class Assignment2_LinearSearch {
    public static void main(String[] args) {
        //Linear Search(Works for both Sorted or Unsorted array)
        int a[] = {12,13,14,15,16,19};
        int searchElement = 19;
        boolean status = false;
        for(int i=0;i<a.length;i++)
        {
            if(searchElement==a[i])
            {
                System.out.println("Searched Element "+searchElement+ " found at index :"+i);
                status=true;
                break;
            }

        }
        if(status==false) {
            System.out.println("Element not found");
        }
    }
}
