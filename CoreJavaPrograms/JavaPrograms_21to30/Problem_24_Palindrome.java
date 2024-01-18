package JavaPrograms_21to30;

import java.util.Scanner;

public class Problem_24_Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string: ");
		String value = sc.next();
		
		String reversed = "";
		
		int strlenth = value.length()-1;
		for(int i = strlenth; i >= 0; i--) {
			reversed = reversed + value.charAt(i);
		}
		
		if((reversed.toLowerCase()).equals(value.toLowerCase())) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not palindrome");
		}
		sc.close();
	}
}
