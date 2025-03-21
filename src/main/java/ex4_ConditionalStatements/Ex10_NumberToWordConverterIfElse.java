package ex4_ConditionalStatements;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Ex10_NumberToWordConverterIfElse  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num == 1)
        {
            System.out.println("ONE");
        }
        else if (num == 2)
        {
            System.out.println("TWO");
        }
        else if (num==3)
        {
            System.out.println("THREE");
        }
        else if (num==4)
        {
            System.out.println("FOUR");
        }
        else if (num==5)
        {
            System.out.println("FIVE");
        }
        else if (num==6)
        {
            System.out.println("SIX");
        }
        else
        {
            System.out.println("NOT A VALID NUMBER");
        }
        sc.close();
    }
}
