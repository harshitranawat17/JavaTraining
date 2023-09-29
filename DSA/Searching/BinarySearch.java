package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 8, 10, 17, 25, 42, 55};
        int target = 17;

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    // Binary search algorithm (recursive)
    public static int binarySearch(int[] arr, int target) {
        return binarySearchRecursive(arr, target, 0, arr.length - 1);
    }

    // Recursive helper function for binary search
    private static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found, return its index
            }

            if (arr[mid] < target) {
                return binarySearchRecursive(arr, target, mid + 1, right); // Search in the right half
            } else {
                return binarySearchRecursive(arr, target, left, mid - 1); // Search in the left half
            }
        }

        return -1; // Element not found in the array
    }
}

