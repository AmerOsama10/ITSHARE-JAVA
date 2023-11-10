
package com.itshare.ds.tree;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
        // Create a TreeSet to store integers in ascending order
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the TreeSet
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(6);

        // Display the elements in sorted order
        System.out.println("Sorted Numbers: " + numbers);

        // Access the smallest and largest elements
        int smallest = numbers.first();
        int largest = numbers.last();
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

        // Remove an element
        numbers.remove(2);
        numbers.remove(2);

        System.out.println("After removing 2: " + numbers);
    }
}
