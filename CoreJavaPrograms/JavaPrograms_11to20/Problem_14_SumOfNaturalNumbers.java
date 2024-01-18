package JavaPrograms_11to20;

import java.util.Scanner;
public class Problem_14_SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("enter the number till to calculate sum: ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i<=num; i++) {
			sum += i;
		}
		
		System.out.println("sum is "+sum);
		
		sc.close();
	}
}
