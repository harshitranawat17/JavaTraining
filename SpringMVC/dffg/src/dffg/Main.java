package dffg;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		int[] arr = new int[50000000];
		ArrayList<Integer> arrayList = new ArrayList<>(50000000);
		Vector<Integer> vector = new Vector<>(50000000);
		Random random = new Random();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000000; i++) {
			int num = random.nextInt(Integer.MAX_VALUE);
			arr[i] = num;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time to add 50 million integers to array: " + (endTime - startTime) + "ms");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000000; i++) {
			int num = random.nextInt(Integer.MAX_VALUE);
			arrayList.add(num);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Time to add 50 million integers to ArrayList: " + (endTime - startTime) + " ms");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000000; i++) {
			int num = random.nextInt(Integer.MAX_VALUE);
			vector.add(num);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Time to add 50 million integers to Vector: " + (endTime - startTime) + "ms");
// Sort the array
		long start = System.currentTimeMillis();
		Arrays.sort(arr);
		long end = System.currentTimeMillis();
		long timeToSortArray = end - start;
		System.out.println("Time to sort array: " + timeToSortArray + " ms");
// Sort the ArrayList
		start = System.currentTimeMillis();
		Collections.sort(arrayList);
		end = System.currentTimeMillis();
		long timeToSortArrayList = end - start;
		System.out.println("Time to sort ArrayList: " + timeToSortArrayList + " ms");
// Sort the Vector
		start = System.currentTimeMillis();
		Collections.sort(vector);
		end = System.currentTimeMillis();
		long timeToSortVector = end - start;
		System.out.println("Time to sort Vector: " + timeToSortVector + " ms");
	}
}
