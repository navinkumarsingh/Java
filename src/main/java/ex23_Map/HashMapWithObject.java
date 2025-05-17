package ex23_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

class Book {
    int id;
    String name;
    String author;
    int qty;

    Book(int id, String name, String author, int qty) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.qty = qty;
    }
}

public class HashMapWithObject {
    public static void main(String[] args) {
        Book book1 = new Book(101, "Java Programming", "Smith", 2);
        Book book2 = new Book(101, "Python Programming", "Scott", 3);
        Book book3 = new Book(103, "C #  Programming", "David", 4);

        HashMap<Integer, Book> hm = new HashMap<Integer, Book>();
        hm.put(1, book1);
        hm.put(2, book2);
        hm.put(3, book3);

        //Using for-each loop
        System.out.println("Using for-each loop");
        for (Integer key : hm.keySet()) {
            Integer id = hm.get(key).id;
            String name = hm.get(key).name;
            String author = hm.get(key).author;
            Integer qty = hm.get(key).qty;

            System.out.println(id + " " + name + " " + author + " " + qty);
        }

        System.out.println("\nUsing entrySet with iterator");
        Iterator<Entry<Integer, Book>> entryItr = hm.entrySet().iterator();
        while (entryItr.hasNext()) {
            Entry<Integer, Book> entry = entryItr.next();
            Book book = entry.getValue();
            System.out.println(book.id + " " + book.name + " " + book.author + " " + book.qty);
        }

        // Using iterator
        System.out.println("\nUsing keySet with iterator");
        Iterator<Integer> itr = hm.keySet().iterator();
        while (itr.hasNext()) {
            Integer key = itr.next();
            Book book = hm.get(key);
            System.out.println(book.id + " " + book.name + " " + book.author + " " + book.qty);
        }
    }
}
