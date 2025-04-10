package ex6_Arrays;
/*
Operations on 2-dimensional Arrays
1. Declaring an array
2. Assigning values to an array
3. Finding the size of an array
4. Reading a single value from an array
5. Reading multiple values from an array
*/
public class Ex2_TwoDimensionalArrayUsingForLoop {
    public static void main(String[] args) {

    //Declare 2-dimensional array
    //Approach 1
    /*
    int a[][] = new int[3][2];
   // int [][]a = new int[3][2]; //Bracket before the variable
   // int []a[] = new int[3][2]; //Bracket before and after the variable

    //Store data in Array
    a[0][0] = 100;
    a[0][1] = 200;

    a[1][0] = 300;
    a[1][1] = 400;

    a[2][0] = 500;
    a[2][1] = 600;
    */

        //Approach 2
        //Declare and assign value to an array
        int a[][] = {    {100,200},
                         {300,400},
                         {500,600,700}
                    };

        //Find size of an array
        System.out.println("length of rows: "+a.length);
        System.out.println("length of columns: "+a[0].length);
        System.out.println("length of columns: "+a[2].length);

        //Read single value from an array
        System.out.println("Print Single value from an array: " + a[2][1]);

        //Read all the data using nested for loop
        //using normal for loop
        for(int row=0;row<=a.length-1;row++) //0 1 2 3
        {
            for(int col=0;col<=a[row].length-1;col++) //0 1 2
            {
                System.out.print(a[row][col]+ "  "); //100 200 300 400 500 600 700
            }
            System.out.println();
        }


    }
}
