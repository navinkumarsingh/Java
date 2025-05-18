// Declaring the package name - this file belongs to the package 'ex23_Map'
package ex23_Map;

// Importing required classes from Java Collections Framework
import java.util.HashMap;              // HashMap is used to store key-value pairs
import java.util.Iterator;            // Iterator is used to loop through collections
import java.util.Map.Entry;           // Entry is used to represent key-value pairs in a map

// Main class
public class HashMapExample {
    // Main method - starting point of the program
    public static void main(String[] args) {

        // Declaration of a HashMap
        // A HashMap that stores Integer keys and String values
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        // Adding key-value pairs to the HashMap using put() method
        hm.put(100, "Sudhir");     // Key=100, Value="Sudhir"
        hm.put(101, "Sushil");     // Key=101, Value="Sushil"
        hm.put(102, "Navin");      // Key=102, Value="Navin"
        hm.put(103, "Sudhir");     // Key=103, Value="Sudhir" (duplicate value is allowed)
        hm.put(102, "Ved");        // Key=102, Value="Ved" (overwrites previous value "Navin")
        hm.put(null, "null");      // Key=null, Value="null" (null keys are allowed in HashMap)

        // Printing the full content of the HashMap
        System.out.println("HashMap content:" + hm);
        // Output may look like: {null=null, 100=Sudhir, 101=Sushil, 102=Ved, 103=Sudhir}

        // Removing a key-value pair from the HashMap using the key
        hm.remove(103);  // Removes the pair with key 103
        System.out.println("HashMap content after removing a Pair:" + hm);
        // Now the pair with key=103 is no longer present

        // Accessing a specific value using its key
        System.out.println(hm.get(100)); // Output: Sudhir

        // Getting all the keys from the HashMap
        System.out.println("Keys is the HashMap:" + hm.keySet());
        // Displays all the keys in the map as a Set: [null, 100, 101, 102]

        // Getting all the values from the HashMap
        System.out.println("Values is the HashMap:" + hm.values());
        // Displays all the values in the map: [null, Sudhir, Sushil, Ved]

        // Reading all key-value pairs using a for-each loop
        System.out.println("Reading hashmap using for-each loop");
        for (Integer key : hm.keySet()) {                     // Loop through all keys
            System.out.println(key + " " + hm.get(key));      // Print key and corresponding value
        }
        /*
          Example Output:
          null null
          100 Sudhir
          101 Sushil
          102 Ved
        */

        // Reading all key-value pairs using Iterator - method 1 (entrySet)
        System.out.println("\nReading hashmap using Iterator first way");
        Iterator<Entry<Integer,String>> itr = hm.entrySet().iterator(); // Getting iterator over entries
        while(itr.hasNext()) {
            Entry<Integer,String> entry = itr.next();                   // Get next key-value entry
            System.out.println(entry.getKey()+" "+entry.getValue());    // Print key and value
        }

        // Reading all key-value pairs using Iterator - method 2 (keySet)
        System.out.println("\nReading hashmap using Iterator second way");
        Iterator<Integer> itr1 = hm.keySet().iterator();   // Getting iterator over keys
        while(itr1.hasNext()) {
            Integer key = itr1.next();                     // Get the next key
            System.out.println(key+" "+hm.get(key));       // Get and print the corresponding value
        }
    }
}
