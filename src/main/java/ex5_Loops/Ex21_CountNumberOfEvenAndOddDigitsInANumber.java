package ex5_Loops;
import java.util.Scanner;
public class Ex21_CountNumberOfEvenAndOddDigitsInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int evenDigitCount = 0;
        int oddDigitCount = 0;
        while(num>0)
        {
            int rev = num%10;
            num=num/10;
            if(rev%2==0)
            {
               evenDigitCount++;
            }
            else
            {
                oddDigitCount++;
            }
        }
        System.out.println("Even digit counts are: "+evenDigitCount);
        System.out.println("Odd digit counts are: "+oddDigitCount);
    }
}
