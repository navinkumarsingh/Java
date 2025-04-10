package ex7_strings;

import java.util.Scanner;

public class Ex3_ReverseAStringUsingStringBuffer {
    public static void main(String[] args) {
        //Approach3: using StringBuffer class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }

}
