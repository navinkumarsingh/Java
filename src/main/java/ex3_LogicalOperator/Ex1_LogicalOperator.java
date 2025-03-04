package ex3_LogicalOperator;

public class Ex1_LogicalOperator {
    /*
    Logical Operators are &&,||,!
     */
        public static void main(String[] args) {
            int a=7, b=10, c=15,d=7,e=20;
            //Logical Operators
            //&&
            System.out.println((a>b) && (a>c));
            System.out.println(a<b && b<c);
            //||
            System.out.println(b>a || a>c);
            System.out.println(a<b || a<c);
            //!
            System.out.println(!(b>a));
            System.out.println(!(a>b));
        }
    }

