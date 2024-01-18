/*Algorithm:


*/
package JavaPrograms_1to10;

import java.util.Scanner;

public class Problem_2 {
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter first interger value: ");
		int value1 = sc.nextInt();
		System.out.print("Enter second interger value: ");
		int value2 = sc.nextInt();
		
		int result = Add(value1, value2);
		System.out.println("Result: "+result);
		
		sc.close();
	}
	
	public static int Add(int value1, int value2) {
		int add = value1+value2;
		return add;
	}
}
