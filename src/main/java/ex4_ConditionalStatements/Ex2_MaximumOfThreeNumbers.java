package ex4_ConditionalStatements;

public class Ex2_MaximumOfThreeNumbers {
    public static void main(String args[]){
        int a=5,b=1,c=6;
        if(a>b && a>c){
            System.out.println("A is Greatest");
        } else if (b>c) {
            System.out.println("B is Greatest");
        }else{
            System.out.println("C is Greatest");
        }
    }
}
