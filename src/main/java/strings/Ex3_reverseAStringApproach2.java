package strings;

import java.util.Scanner;
//Approach2: By converting A1_String to char array type
public class Ex3_reverseAStringApproach2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        String strRev = "";
        char a[] = str.toCharArray();
        for(int i=a.length-1;i>=0;i--)
        {
            strRev=strRev+a[i];
        }
        System.out.println(strRev);

    }
}
