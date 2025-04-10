package ex7_strings;

import java.util.Scanner;

public class Ex2_ReverseAStringApproach1 {
    public static void main(String[] args) {
        //Approach1 : using length() and
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        String revStr = "";
        for (int i= str.length()-1;i>=0;i--)
        {
            //revStr = revStr + str.charAt(i);
            revStr = revStr.concat(String.valueOf(str.charAt(i)));
        }
        System.out.print("Reverse String is:"+revStr);
    }

}
