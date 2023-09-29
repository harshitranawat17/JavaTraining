package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void main(String[] args) {
        double[] arr = {0.42, 0.32, 0.33, 0.52, 0.37, 0.47, 0.51};

        System.out.println("Original Array:");
        printArray(arr);

        bucketSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    // Bucket Sort algorithm for sorting an array of doubles
    public static void bucketSort(double[] arr) {
        int n = arr.length;

        if (n <= 1) {
            return; // Already sorted or empty array
        }

        // Create a list of empty buckets
        List<Double>[] buckets = new ArrayList[n];

        // Initialize each bucket
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Place each element into the appropriate bucket
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (n * arr[i]);
            buckets[bucketIndex].add(arr[i]);
        }

        // Sort each bucket individually (using any sorting algorithm)
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // Concatenate the sorted buckets to get the final sorted array
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (double element : buckets[i]) {
                arr[index++] = element;
            }
        }
    }

    // Helper method to print an array
    public static void printArray(double[] arr) {
        for (double value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
