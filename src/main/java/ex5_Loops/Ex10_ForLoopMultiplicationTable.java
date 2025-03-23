package ex5_Loops;

import java.util.Scanner;

public class Ex10_ForLoopMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n =sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println("Multiplication table of 5 is: "+n+"x"+i+" = "+(n*i));
        }
    }
}
