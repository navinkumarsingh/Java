package ex5_Loops;

import java.util.Scanner;

public class Ex20_ReverseANumberUsingAlgorithm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt(); //1234
        int revNum = 0;
        while (n > 0)
        {
            revNum= revNum*10 + n%10;
            n=n/10;
        }
        System.out.println(revNum);
    }
}

/*
Enter a Number
123
o/p: 321
*/
