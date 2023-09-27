package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Display the ArrayList
        System.out.println("ArrayList: " + fruits);

        // Access an element by index
        System.out.println("Element at index 2: " + fruits.get(2));

        // Modify an element by index
        fruits.set(1, "Blueberry");
        System.out.println("Updated ArrayList: " + fruits);

        // Check if an element exists in the ArrayList
        String searchElement = "Cherry";
        System.out.println(searchElement + " exists: " + fruits.contains(searchElement));

        // Get the index of an element
        int index = fruits.indexOf("Date");
        System.out.println("Index of 'Date': " + index);

        // Remove an element by value
        fruits.remove("Cherry");
        System.out.println("Updated ArrayList after removing 'Cherry': " + fruits);

        // Sort the ArrayList
        Collections.sort(fruits);
        System.out.println("Sorted ArrayList: " + fruits);

        // Iterate through the ArrayList using an Iterator
        System.out.print("Iterating through ArrayList: ");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Get the size of the ArrayList
        System.out.println("Size of ArrayList: " + fruits.size());

        // Clear the ArrayList
        fruits.clear();
        System.out.println("ArrayList after clearing: " + fruits);
    }
}

