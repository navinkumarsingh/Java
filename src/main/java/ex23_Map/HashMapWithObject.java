// Package declaration (this code belongs to the ex23_Map package)
package ex23_Map;

// Importing necessary classes
import java.util.HashMap;                      // For using the HashMap class
import java.util.Iterator;                    // For iterating over collections
import java.util.Map.Entry;                   // For accessing map entries (key-value pairs)

// Defining a custom class 'Book' to hold book details
class Book {
    int id;           // Book ID
    String name;      // Name of the book
    String author;    // Author of the book
    int qty;          // Quantity of books available

    // Constructor to initialize the book object with values
    Book(int id, String name, String author, int qty) {
        this.id = id;           // Assigning book ID
        this.name = name;       // Assigning book name
        this.author = author;   // Assigning book author
        this.qty = qty;         // Assigning book quantity
    }
}

// Main class to demonstrate HashMap with custom Book objects
public class HashMapWithObject {
    // Main method: entry point of the program
    public static void main(String[] args) {
        // Creating three Book objects with different details
        Book book1 = new Book(101, "Java Programming", "Smith", 2);
        Book book2 = new Book(101, "Python Programming", "Scott", 3);
        Book book3 = new Book(103, "C #  Programming", "David", 4);

        // Creating a HashMap to store Integer keys and Book values
        HashMap<Integer, Book> hm = new HashMap<Integer, Book>();

        // Putting key-value pairs into the HashMap
        hm.put(1, book1);  // Key = 1, Value = book1
        hm.put(2, book2);  // Key = 2, Value = book2
        hm.put(3, book3);  // Key = 3, Value = book3

        // Printing books using a for-each loop with keySet
        System.out.println("Using for-each loop");
        for (Integer key : hm.keySet()) {                 // Looping through each key in the map
            Integer id = hm.get(key).id;                  // Getting book ID using the key
            String name = hm.get(key).name;               // Getting book name
            String author = hm.get(key).author;           // Getting book author
            Integer qty = hm.get(key).qty;                // Getting book quantity

            // Printing book details
            System.out.println(id + " " + name + " " + author + " " + qty);
        }

        // Printing books using entrySet with Iterator
        System.out.println("\nUsing entrySet with iterator");
        Iterator<Entry<Integer, Book>> entryItr = hm.entrySet().iterator();   // Getting iterator over map entries
        while (entryItr.hasNext()) {                                         // Loop while there are more entries
            Entry<Integer, Book> entry = entryItr.next();                    // Get next entry (key-value pair)
            Book book = entry.getValue();                                    // Get the Book object from the entry
            // Print book details
            System.out.println(book.id + " " + book.name + " " + book.author + " " + book.qty);
        }

        // Printing books using keySet with Iterator
        System.out.println("\nUsing keySet with iterator");
        Iterator<Integer> itr = hm.keySet().iterator();         // Getting iterator over the map keys
        while (itr.hasNext()) {                                 // Loop while there are more keys
            Integer key = itr.next();                           // Get next key
            Book book = hm.get(key);                            // Get Book object using the key
            // Print book details
            System.out.println(book.id + " " + book.name + " " + book.author + " " + book.qty);
        }
    }
}
