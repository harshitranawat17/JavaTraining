package JavaPrograms_1to10;

import java.util.Scanner;
public class Problem_4 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char value = sc.next().charAt(0);
		
		System.out.println("The ASCII value of character is: "+(int)value);
		
		sc.close();
	}
}
