package JavaPrograms_91to100;

public class Problem_97_QuickSort {
	public static void main(String[] args) {
		int arr[] = {15,9,7,13,12,16,4,18,11};
		
		int len = arr.length;
		
		quicksortrecursion(arr,0,len-1);
		printarray(arr);
 	}
	static int partition(int[] arr, int low, int high) {
		
		int pivot = arr[(low+high)/2];
		
		while(low <= high) {
			
			while(arr[low] < pivot) {
				low++;
			}
			while(arr[high] > pivot) {
				high--;
			}
			if(low <= high) {
				
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				
				low++;
				high--;
			}
		}
		return low;
	}
	
	static void quicksortrecursion(int[] arr, int low, int high) {
		
		int pi = partition(arr, low, high);
		if(low < pi-1) {
			quicksortrecursion(arr, low, pi-1);
		}
		if(pi < high) {
			quicksortrecursion(arr, pi, high);
		}
	}
	
	static void printarray(int[] arr) {
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
}
