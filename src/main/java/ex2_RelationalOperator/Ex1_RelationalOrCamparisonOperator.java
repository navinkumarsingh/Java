package ex2_RelationalOperator;

/*
These operators are used for comparing the data.
These returns true or false.
Relational operators are >,<,>=,<=,==,!=
Logical Operators are &&,||,!
 */
public class Ex1_RelationalOrCamparisonOperator {
    public static void main(String[] args) {
        int a=7, b=10, c=15,d=7,e=20;
        float f=1.2f, g=2.2f;
        String s= null;
        String s1 = "Navin";
        String s2 = "Navin";
        //>
        System.out.println(f>g);
        System.out.println(f>g);
        //>
        System.out.println(b>c);
        System.out.println(c>d);
        //<
        System.out.println(c<b);
        System.out.println(b<c);
        //>=
        System.out.println(b>=e);
        System.out.println(a>=d);
        //<=
        System.out.println(c<=b);
        System.out.println(b<=c);
        //==
        System.out.println(a==b);
        System.out.println(a==d);
        //!=
        System.out.println(a!=d);
        System.out.println(a!=c);
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
