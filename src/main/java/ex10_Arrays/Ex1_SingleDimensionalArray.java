package ex10_Arrays;

/*     1. Declare an array
       2. add values into array
       3. Find Size of an array
       4. read single value from an array
       5. read multiple values from an array
        */
public class Ex1_SingleDimensionalArray {
    public static void main(String[] args) {
 //Approach 1
        //Declare an array
       /* int a[] = new int[5];

        //store data/add value in an array
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        a[4] = 500;
*/
        //Approach 2
        //Declare and assignment an array
        int a[] = {100,200,300,400,500};
        //int a[] = {};
        //find length of an array
        System.out.println("Length of an array :"+a.length);

        //Read specific location value from an array
        //We can fetch using index of the value
        System.out.println("Fourth index value is:"+a[4]); //Here 4 is index

        //read multiple values from an array
        //Using normal for loop
      /*  for(int i=0;i<a.length;i++) // i<=4 i<5    a.length-1    i<a.length
        //for(int i=0;i<=a.length-1;i++)
        {
            System.out.print(a[i]+ " ");
        }
*/
        //Using enhanced for loop
        for(int arr:a)
        {
            System.out.println(arr);
        }
    }
}

