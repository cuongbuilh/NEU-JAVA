package ex7_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();

        // (int) (Math.random() * 10) gives a random integer from 0-9
        myMap.put("Apples", (int) (Math.random() * 10));

        // Note that although myMap requires an Integer, int will work too
        // this is a feature of Java 5.0 called auto-boxing
        // If an int is required, an Integer will also work: auto-unboxing
        myMap.put("Bananas", (int) (Math.random() * 10));
        myMap.put("Grapes", (int) (Math.random() * 10));

        // Cherries has the same Integer value as Grapes
        myMap.put("Cherries", myMap.get("Grapes"));
        myMap.put("Watermelons", (int) (Math.random() * 10));

        // Since the keys must be unique, there will only be one
        // "Watermelons" key
        myMap.put("Watermelons", (int) (Math.random() * 10));
        // Prints out keys and values
        System.out.println("my map is: " + myMap);

        TreeMap<String, Integer> mySortedMap = new TreeMap<String, Integer>(myMap);
        System.out.println("my sorted map is: " + mySortedMap);
        HashMap<Integer, String> myMap2 = new HashMap<Integer, String>();

        // keySet() contains all keys in myMap
        for (String s : myMap.keySet())
            myMap2.put(myMap.get(s), new String(s));

        // Note that myMap2 is smaller than myMap
        System.out.println("my second map is: " + myMap2);

        TreeMap<Integer, String> mySortedMap2 = new TreeMap<Integer,String>(myMap2);
        System.out.println("my second sorted map is: " + mySortedMap2);
        System.out.println();

        System.out.println("my second map contains 3: " + myMap2.containsKey(3));

        System.out.println("my second map contains 3: " + myMap2.containsKey(3));
    }
}
