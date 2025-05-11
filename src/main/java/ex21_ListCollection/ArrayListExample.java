package ex21_ListCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        // Declaration of ArrayList with generics to ensure type safety
        List<Object> myList = new ArrayList<>();

        // Adding various types of data
        myList.add(100);        // Integer
        myList.add(10.5);       // Double
        myList.add("Welcome");  // String
        myList.add('A');        // Character
        myList.add(true);       // Boolean
        myList.add(100);        // Duplicate Integer
        myList.add(null);       // Null value
        myList.add(null);       // Another null

        // Finding size of the list
        System.out.println("Size of array list: " + myList.size()); // 8

        // Printing the list
        System.out.println("ArrayList elements: " + myList);

        // Removing an element by index
        myList.remove(5); // Removes the duplicate 100
        System.out.println("After removing element at index 5: " + myList);

        // Inserting an element at a specific position
        myList.add(2, "Java");
        System.out.println("After inserting 'Java' at index 2: " + myList);

        // Modifying an element at a specific index
        myList.set(2, "Python");
        System.out.println("After modifying index 2 to 'Python': " + myList);

        // Accessing a specific element
        System.out.println("Element at index 3: " + myList.get(3)); // Welcome

        // 1. Reading elements using a normal for loop
        System.out.println("Getting data using for loop:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // 2. Reading elements using for-each loop
        System.out.println("Getting data using for-each loop:");
        for (Object element : myList) {
            System.out.println(element);
        }

        // 3. Reading elements using Iterator
        System.out.println("Getting data using Iterator:");
        Iterator<Object> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Removing a specific group of elements
        List<Object> myList2 = new ArrayList<>();
        myList2.add(100);
        myList2.add("Welcome");

        myList.removeAll(myList2);
        System.out.println("After removing elements from myList2: " + myList);

        // Clearing all elements from the list
        myList.clear();
        System.out.println("After clearing the list: " + myList);
    }
}
