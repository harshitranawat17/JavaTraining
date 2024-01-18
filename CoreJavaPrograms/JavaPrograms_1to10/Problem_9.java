package JavaPrograms_1to10;
import java.util.Scanner;
public class Problem_9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int first = sc.nextInt();
		System.out.print("Enter second number: ");
		int second = sc.nextInt();
		System.out.print("Enter third number: ");
		int third = sc.nextInt();
		
		if(first > second && first > third) {
			System.out.println(first+" is largest number");
		}
		if(second > first && second > third) {
			System.out.println(second+" is largest number");
		}
		else {
			System.out.println(third+" is the largest number");
		}
		
		sc.close();
	}
}
	