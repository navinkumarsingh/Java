package ex4_ConditionalStatements;

import java.util.Scanner;

class Ex3_OddOrEven
{
    public static void main(String args[])
    {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    n=sc.nextInt();
    if(n%2==0){
        System.out.println("Number is Even");
    }else
    {
        System.out.println("Number is Odd");
    }
    }
}
