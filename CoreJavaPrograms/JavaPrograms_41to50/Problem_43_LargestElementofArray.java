package JavaPrograms_41to50;

public class Problem_43_LargestElementofArray {
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,8,5};
        int largest = arr[0];

        for (int num: arr) {
            if(largest < num)
                largest = num;
        }

        System.out.println("Largest element: "+largest);
	} 
}
