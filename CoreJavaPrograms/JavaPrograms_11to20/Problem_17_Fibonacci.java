package JavaPrograms_11to20;


import java.util.Scanner;
public class Problem_17_Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int first = 0;
		int second = 1;
		
		for(int i = 1; i<=num; i++) {
			System.out.print(first+" ,");
			
			int next = first+second;
			first = second;
			second = next;
		}
		sc.close();
	}
}
