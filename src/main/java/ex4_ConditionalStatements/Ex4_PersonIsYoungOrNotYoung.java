package ex4_ConditionalStatements;

import java.util.Scanner;
public class Ex4_PersonIsYoungOrNotYoung {
    //Check if a person is young
    public static void main(String args[]){
        float age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        age=sc.nextFloat();
        //Consider 16 to 55 age is young age.
        if(age>=16 && age<=55){
            System.out.println("Person is Young");
        }
        else
        {
            System.out.println("Person is not Young");
        }
    }
}
