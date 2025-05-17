package ex23_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class HashMapExample {
    public static void main(String[] args) {
        //Declaration
        //HashMap hm = new HashMap();
        //Map<Integer,String> hm = new HashMap<Integer,String>();
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        //Adding pairs to hashmap
        hm.put(100, "Sudhir");
        hm.put(101, "Sushil");
        hm.put(102, "Navin");
        hm.put(103, "Sudhir"); //duplicate values are allowed
        hm.put(102, "Ved"); //duplicate keys are not allowed
        hm.put(null, "null");

        //Printing hashmap
        System.out.println("HashMap content:" + hm);//{null=null, 100=Sudhir, 101=Sushil, 102=Sushil, 103=Sudhir}

        //Remove pair from HashMap
        hm.remove(103); //here 103 is key
        System.out.println("HashMap content after removing a Pair:" + hm);//{null=null, 100=Sudhir, 101=Sushil, 102=Ved}

        //Access specific value from HashMap
        System.out.println(hm.get(100)); //Sudhir -  here 100 is key

        //Accessing all the keys from HashMap
        System.out.println("Keys is the HashMap:" + hm.keySet()); //[null, 100, 101, 102]

        //Accessing all the values from HashMap
        System.out.println("Values is the HashMap:" + hm.values()); //[null, Sudhir, Sushil, Ved]

        System.out.println("Reading hashmap using for-each loop");
        //approach 1) Reading hashmap using for-each loop
        for (Integer key : hm.keySet()) {
            System.out.println(key + " " + hm.get(key));
        }
        /*
        null null
        100 Sudhir
        101 Sushil
        102 Ved
        */
        System.out.println("\nReading hashmap using Iterator first way");
        //Approach 2) Reading hashmap using Iterator
      Iterator<Entry<Integer,String>> itr = hm.entrySet().iterator();
      while(itr.hasNext())
      {
          Entry<Integer,String> entry = itr.next();
          System.out.println(entry.getKey()+" "+entry.getValue());
      }

        System.out.println("\nReading hashmap using Iterator second way");
        //Approach 2) Reading hashmap using Iterator
        Iterator<Integer> itr1 = hm.keySet().iterator();
        while(itr1.hasNext())
        {
            Integer key = itr1.next();
            System.out.println(key+" "+hm.get(key));
        }
    }
}
