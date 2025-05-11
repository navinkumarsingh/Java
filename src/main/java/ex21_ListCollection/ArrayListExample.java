package ex21_ListCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {

        //Declaration of ArrayList
        //ArrayList myList = new ArrayList();
        List myList = new ArrayList();
        //ArrayList<String> myList = new ArrayList<String>();

        //Adding various types data

        myList.add(100);   // Integer
        myList.add(10.5); //Double
        myList.add("Welcome");  //String
        myList.add('A');  //Character
        myList.add(true);  //Boolean
        myList.add(100);  //Integer
        myList.add(null);
        myList.add(null);

        //Finding Size
        System.out.println("Size of array list:" + myList.size()); //8

        //Printing arraylist
        System.out.println("ArrayList elements:" + myList); //[100, 10.5, Welcome, A, true, 100, null, null]

//Remove an element
        myList.remove(5);   // 5 is an index of the element
        System.out.println("After removing ArrayList elements:"+ myList);//[100, 10.5, Welcome, A, true, null, null]

        //inserting
        myList.add(2,"Java");
        System.out.println("After inserting arrayList element:"+myList);//[100, 10.5, Java, Welcome, A, true, null, null]

        //modification
        myList.set(2,"Python");
        System.out.println("After modification ArrayList element:"+myList);//[100, 10.5, Python, Welcome, A, true, null, null]

        //access specific element
        System.out.println("Element at index 3:"+myList.get(3));//Welcome

        //1. read elements using normal for loop
        System.out.println("Getting data using for loop....");
        for(int i=0;i<myList.size();i++)
        {
            System.out.println(myList.get(i));
        }

        //2. read elements using for..each loop
        System.out.println("Getting data using for-each loop.... ");
        for(Object element:myList)
        {
            System.out.println(element);
        }

        //3. read elements using Iterator
        System.out.println("Getting data using Iterator....");
        Iterator iterate=myList.iterator();
        while(iterate.hasNext())
        {
            System.out.println(iterate.next());
        }

        //removing specific group of elements
        ArrayList myList2 = new ArrayList();
        myList2.add(100);
        myList2.add("Welcome");
        myList.removeAll(myList2);
        System.out.println("After removing group of elements:"+myList);

        //Clear all the elements
        myList.clear();
        System.out.println("After clearing:"+myList);
    }
}
