package JavaPrograms_91to100;

public class Problem_98_MergeSort {
	
	public static void main(String[] args) {
		
        int[] arr = {3, 9, 10, 1, 8, 7, 5, 2};
        
        mergeSort(arr);
        
        for (int element: arr) {
            System.out.print(element + " ");
        }
    }

    public static void mergeSort(int[] arr) {
    	
        if (arr == null || arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;
        
        int[] leftArray = new int[mid];
        
        int[] rightArray = new int[arr.length - mid];

        System.arraycopy(arr, 0, leftArray, 0, mid);

        if (arr.length - mid >= 0)
            System.arraycopy(arr, mid, rightArray, 
                              0, arr.length - mid);

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, arr);
    }

    private static void merge(int[] leftArray, 
                              int[] rightArray, int[] arr) {
        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
            	arr[k++] = leftArray[i++];
            } else {
            	arr[k++] = rightArray[j++];
            }
        }
        while (i < leftArray.length) {
        	arr[k++] = leftArray[i++];
        }
        while (j < rightArray.length) {
        	arr[k++] = rightArray[j++];
        }
    }
}
