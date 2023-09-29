
package Hashing;

import java.util.LinkedList;

class DirectChainingDemo {
    private static final int TABLE_SIZE = 10;
    private LinkedList<Integer>[] table;

    public DirectChainingDemo() {
        table = new LinkedList[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function to map a key to an index in the hash table
    private int hash(int key) {
        return key % TABLE_SIZE;
    }

    // Insert an element into the hash table
    public void insert(int key) {
        int index = hash(key);
        table[index].add(key);
    }

    // Delete an element from the hash table
    public void delete(int key) {
        int index = hash(key);
        table[index].remove(Integer.valueOf(key)); // Remove the first occurrence of the key
    }

    // Search for an element in the hash table
    public boolean search(int key) {
        int index = hash(key);
        return table[index].contains(key);
    }

    // Print the hash table
    public void printTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.print("Bucket " + i + ": ");
            for (Integer key : table[i]) {
                System.out.print(key + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    	DirectChainingDemo hashTable = new DirectChainingDemo();

        // Insert elements
        hashTable.insert(5);
        hashTable.insert(15);
        hashTable.insert(25);
        hashTable.insert(6);

        System.out.println("Hash Table:");
        hashTable.printTable();

        // Search for elements
        System.out.println("\nSearch 15: " + hashTable.search(15));
        System.out.println("Search 10: " + hashTable.search(10));

        // Delete elements
        hashTable.delete(15);
        hashTable.delete(10);

        System.out.println("\nHash Table after deletion:");
        hashTable.printTable();
    }
}
