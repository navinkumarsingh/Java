// Declaring the package name - this file belongs to the 'ex22_SetCollection' package
package ex22_SetCollection;

// Importing required classes
import java.util.ArrayList;    // For converting Set to List
import java.util.Iterator;     // For iterating over Set elements
import java.util.Set;          // Interface for Set collections
import java.util.HashSet;      // HashSet class implements the Set interface

// Main class
public class HashSetExample {
    // Main method - entry point of the Java program
    public static void main(String[] args) {

        // Creating a HashSet that can store any type of object (mixed types)
        // You could also use: Set mySet = new HashSet(); // more generic
        // Or: Set<String> mySet = new HashSet<String>(); // for String only
        HashSet<Object> mySet = new HashSet<Object>();

        // Adding different types of elements to the HashSet
        mySet.add(10);            // Integer
        mySet.add(10.5);          // Double
        mySet.add('A');           // Character
        mySet.add("Welcome");     // String
        mySet.add(false);         // Boolean
        mySet.add(null);          // Null value (allowed in HashSet)
        mySet.add(10);            // Duplicate value (ignored by HashSet)
        mySet.add(null);          // Duplicate null (also ignored)

        // Getting the total number of unique elements in the HashSet
        System.out.println("Size is:" + mySet.size()); // Should print 6 (duplicates ignored)

        // Printing elements in the HashSet (insertion order not preserved)
        System.out.println("Elements in HashSet:" + mySet);
        // HashSet does not guarantee order, output may look like: [null, A, 10.5, false, 10, Welcome]

        // Removing a specific element from the HashSet
        mySet.remove(10.5);  // Removes value 10.5, not by index (HashSet doesn't use indexes)
        System.out.println("HashSet elements after removing" + mySet);

        // Inserting at a specific index is not possible in HashSet
        // Also, we cannot directly access an element by index

        // Workaround: Convert HashSet to ArrayList to access elements by index
        ArrayList myList = new ArrayList(mySet);   // Convert HashSet to ArrayList
        System.out.println("Elements in ArrayList:" + myList);
        // Example Output: [null, A, false, 10, Welcome]

        // Access and print element at index 4 (fifth position)
        System.out.println("The element present in 3rd position:" + myList.get(4)); // Welcome

        // Convert ArrayList back to a HashSet
        Set mySet1 = new HashSet(myList);   // Re-create a Set from the ArrayList
        System.out.println(mySet1);         // Print the new Set

        // Reading all elements using for-each loop
        System.out.println("Reading data using for-each loop");
        for (Object elements : mySet) {         // Loop through each element in mySet
            System.out.println(elements);       // Print current element
        }

        // Reading all elements using an Iterator
        System.out.println("Reading data using Iterator.......");
        Iterator itr = mySet1.iterator();       // Create an iterator for mySet1

        while(itr.hasNext()) {                  // Check if more elements are present
            System.out.println(itr.next());     // Print the next element
        }
    }
}
