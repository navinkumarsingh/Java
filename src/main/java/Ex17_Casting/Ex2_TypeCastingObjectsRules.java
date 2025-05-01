package Ex17_Casting;
/*
A b = (C) d;

Ex:
------
Vehicle v=new Car();
Car c=(Car) v;

Where:
	A is the type of the reference you are assigning to.
	C is the type you are casting to.
	d is the original reference.

Rule 1: Valid Conversion
The types of d and C must have a relationship,
meaning they should either be in a parent-child relationship (either parent-to-child or child-to-parent),
or they must be the same type.

Rule 2: Valid Assignment
The type C must either be the same type as A or a child of A in order for the assignment to be valid.

Rule 3: Underlying Object Type
The actual object type referred to by d must be either the same as C or a child of C.

*/


class Fruit{
}

class Apple extends Fruit
{
}

class Orange extends Fruit
{
}


public class Ex2_TypeCastingObjectsRules {

    public static void main(String[] args) {

        //Example1

        //Apple a=new Apple();
        //Orange o=(Orange) a;   // Invalid as per Rule1


        //Example2

        //Fruit f=new Apple();
        //Orange o=(Apple) f;  // Invalid as per Rule2


        //Example3
        //Fruit f=new Apple();
        //Orange o=(Orange) f;  //Invalid as per Rule3


        //Example 4

        Fruit f=new Apple();
        Apple a= (Apple) f;   //Valid.. 3 rules satisfiled...


    }

}



