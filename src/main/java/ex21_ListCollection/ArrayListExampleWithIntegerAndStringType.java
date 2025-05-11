package ex21_ListCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExampleWithIntegerAndStringType {
    public static void main(String[] args) {

        // Declaration of ArrayList with Integer type
        List<Integer> integerList = new ArrayList<>();

        // Adding Integer values
        integerList.add(100);        // Integer
        integerList.add(10);         // Integer
        integerList.add(50);         // Integer

        // Declaration of ArrayList with String type
        List<String> stringList = new ArrayList<>();

        // Adding String values
        stringList.add("Welcome");   // String
        stringList.add("Java");      // String
        stringList.add("Python");    // String

        // Finding size of both lists
        System.out.println("Size of integer list: " + integerList.size()); // 3
        System.out.println("Size of string list: " + stringList.size());   // 3

        // Printing both lists
        System.out.println("Integer List elements: " + integerList);
        System.out.println("String List elements: " + stringList);

        // Removing an element by index (removes 50 from integerList)
        integerList.remove(2); // Removes the integer 50
        System.out.println("After removing element at index 2 from integer list: " + integerList);

        // Inserting an element at a specific position in integerList (inserts 25 at index 1)
        integerList.add(1, 25);
        System.out.println("After inserting 25 at index 1 in integer list: " + integerList);

        // Modifying an element at a specific index in stringList (modifies index 1 to "C++")
        stringList.set(1, "C++");
        System.out.println("After modifying index 1 in string list to 'C++': " + stringList);

        // Accessing a specific element (element at index 2 in stringList)
        System.out.println("Element at index 2 in string list: " + stringList.get(2)); // Python

        // 1. Reading elements from integerList using a normal for loop
        System.out.println("Getting data from integer list using for loop:");
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }

        // 2. Reading elements from stringList using for-each loop
        System.out.println("Getting data from string list using for-each loop:");
        for (String element : stringList) {
            System.out.println(element);
        }

        // 3. Reading elements from integerList using Iterator
        System.out.println("Getting data from integer list using Iterator:");
        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Removing a specific group of elements from stringList
        List<String> removeList = new ArrayList<>();
        removeList.add("Welcome");

        stringList.removeAll(removeList);
        System.out.println("After removing 'Welcome' from string list: " + stringList);

        // Clearing all elements from both lists
        integerList.clear();
        stringList.clear();
        System.out.println("After clearing both lists:");
        System.out.println("Integer List: " + integerList);
        System.out.println("String List: " + stringList);
    }
}
