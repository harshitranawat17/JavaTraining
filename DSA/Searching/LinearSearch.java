package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 25, 42, 8, 17, 55, 3};
        int target = 17;

        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    // Linear search algorithm
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found in the array
    }
}

