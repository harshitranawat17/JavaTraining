package JavaPrograms_31to40;

import java.util.Scanner;

public class Problem_40_ReverseSentenceUsingRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String sen = sc.next();
		
		String result = ReverseString(sen);
		System.out.println(result);
		sc.close();
	}
	
	public static String ReverseString(String sen) {
		
		if(sen.isEmpty()) {
			return sen;
		}
		
		return ReverseString(sen.substring(1))+sen.charAt(0);
	}
}
