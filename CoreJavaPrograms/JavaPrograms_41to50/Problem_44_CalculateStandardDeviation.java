package JavaPrograms_41to50;

public class Problem_44_CalculateStandardDeviation {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int SD = CalSD(arr);

        System.out.println("Standard Deviation ="+ SD);
    }

    public static int CalSD(int arr[])
    {
        int sum = 0, sd = 0;
        int length = arr.length;

        for(int num : arr) {
            sum += num;
        }

        int mean = sum/length;

        for(int num: arr) {
            sd += Math.pow(num - mean, 2);
        }

        return (int) Math.sqrt(sd/length);
    }
	
}
