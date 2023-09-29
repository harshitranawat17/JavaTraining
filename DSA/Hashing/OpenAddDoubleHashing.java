package Hashing;

class OpenAddDoubleHashing {
    private static final int TABLE_SIZE = 10;
    private int[] table;
    private boolean[] isOccupied;

    public OpenAddDoubleHashing() {
        table = new int[TABLE_SIZE];
        isOccupied = new boolean[TABLE_SIZE];
    }

    // Hash function to map a key to an index in the hash table
    private int hash(int key) {
        return key % TABLE_SIZE;
    }

    // Double hash function to calculate the step size for double hashing
    private int doubleHash(int key) {
        return 7 - (key % 7); // Example: 7 is chosen as a prime number
    }

    // Insert an element into the hash table using double hashing
    public void insert(int key) {
        int index = hash(key);
        int originalIndex = index;
        int stepSize = doubleHash(key);

        while (isOccupied[index]) {
            index = (originalIndex + stepSize) % TABLE_SIZE; // Double hashing
            if (index == originalIndex) {
                System.out.println("Hash table is full. Unable to insert " + key);
                return;
            }
        }

        table[index] = key;
        isOccupied[index] = true;
    }

    // Delete an element from the hash table
    public void delete(int key) {
        int index = hash(key);
        int originalIndex = index;
        int stepSize = doubleHash(key);

        while (isOccupied[index]) {
            if (table[index] == key) {
                table[index] = 0; // Mark the slot as empty
                isOccupied[index] = false;
                return;
            }

            index = (originalIndex + stepSize) % TABLE_SIZE; // Double hashing
            if (index == originalIndex) {
                System.out.println(key + " not found in the hash table.");
                return;
            }
        }

        System.out.println(key + " not found in the hash table.");
    }

    // Search for an element in the hash table
    public boolean search(int key) {
        int index = hash(key);
        int originalIndex = index;
        int stepSize = doubleHash(key);

        while (isOccupied[index]) {
            if (table[index] == key) {
                return true;
            }

            index = (originalIndex + stepSize) % TABLE_SIZE; // Double hashing
            if (index == originalIndex) {
                return false;
            }
        }

        return false;
    }

    // Print the hash table
    public void printTable() {
        System.out.println("Hash Table:");
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.println("Slot " + i + ": " + table[i]);
        }
    }

    public static void main(String[] args) {
    	OpenAddDoubleHashing hashTable = new OpenAddDoubleHashing();

        // Insert elements
        hashTable.insert(5);
        hashTable.insert(15);
        hashTable.insert(25);
        hashTable.insert(6);

        hashTable.printTable();

        // Search for elements
        System.out.println("\nSearch 15: " + hashTable.search(15));
        System.out.println("Search 10: " + hashTable.search(10));

        // Delete elements
        hashTable.delete(15);
        hashTable.delete(10);

        hashTable.printTable();
    }
}
