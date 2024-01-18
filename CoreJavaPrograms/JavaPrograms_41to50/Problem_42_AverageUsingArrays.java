package JavaPrograms_41to50;

public class Problem_42_AverageUsingArrays {
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,8,5};
		int sum = 0;
		
		for(int num : arr) {
			sum += num;
		}
		
		int average = sum/arr.length;
		System.out.println("Average is: "+average);
		
	}
}
