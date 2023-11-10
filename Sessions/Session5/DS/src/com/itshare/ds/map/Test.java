
package com.itshare.ds.map;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        // Create a HashMap with Integer keys and String values
        HashMap<Integer, String> map = new HashMap<>();
        
        // Adding elements to the map
        map.put(1, "Ahmed1");
        map.put(2, "Ahmed2");
        map.put(3, "Ahmed3");
        map.put(4, "Ahmed4");

        // Display the contents of the map
        System.out.println("Initial map: " + map);
        
        // Accessing an element by key
        int keyToAccess = 2;
        String value = map.get(keyToAccess);
        System.out.println("Value for key " + keyToAccess + ": " + value);
        
        // Updating an element in the map
        int keyToUpdate = 3;
        String newValue = "UpdatedValue";
        map.put(keyToUpdate, newValue);
        System.out.println("Updated map: " + map);
        
        // Deleting an element from the map
        int keyToDelete = 1;
        map.remove(keyToDelete);
        System.out.println("Map after removing key " + keyToDelete + ": " + map);
        
        // Adding new elements to the map
        map.put(5, "NewValue1");
        map.put(6, "NewValue2");
        System.out.println("Map after adding new elements: " + map);
    }
}
