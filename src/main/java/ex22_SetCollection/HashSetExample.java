package ex22_SetCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        //Set mySet =new HashSet(); //Generic
        //Set<String> mySet = new HashSet<String> (); //Specific
        HashSet<Object> mySet = new HashSet<Object>();

        //Adding element
        mySet.add(10);
        mySet.add(10.5);
        mySet.add('A');
        mySet.add("Welcome");
        mySet.add(false);
        mySet.add(null);
        mySet.add(10); //Duplicate
        mySet.add(null); //Duplicate

        //Size of HashSet
        System.out.println("Size is:" + mySet.size()); //6

        //printing - insertion order not preserved
        System.out.println("Elements in HashSet:" + mySet); //[null, A, 10.5, false, 10, Welcome]

        //remove element
        mySet.remove(10.5);  //Here mySet is a value not index
        System.out.println("HashSet elements after removing" + mySet);

        //Insert element  - Not possible to insert element. Indexing not supported.

        //Access specific element - Not possible, Index not support

        //We can access specific element in different way.
        ArrayList myList = new ArrayList(mySet);
        System.out.println("Elements in ArrayList:" + myList); //[null, A, false, 10, Welcome]
        System.out.println("The element present in 3rd position:" + myList.get(4)); //Welcome

        //converting back to Set
        Set mySet1 = new HashSet(myList);
        System.out.println(mySet1);

        //read data using for-each loop
        System.out.println("Reading data using for-each loop");
        for (Object elements : mySet) {
            System.out.println(elements);
        }

        //read data using Iterator

        System.out.println("Reading data using Iterator.......");
        Iterator itr=mySet1.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
