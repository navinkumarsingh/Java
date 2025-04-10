package ex7_strings;

import java.util.Scanner;

public class Ex22_reverseANumberUsingStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        StringBuilder rev = sb.reverse();
        System.out.println("Reverse Number is:"+rev);
    }
}
