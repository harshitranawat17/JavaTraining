package JavaPrograms_1to10;

import java.util.Scanner;

public class Problem_8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = sc.next().charAt(0);

		char arr[] = { 'a', 'e', 'i', 'o', 'u' };
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			if (ch == arr[i]) {
				count++;
			}
		}
			if (count > 1) {
				System.out.println(ch + " is vovel");
			} else {
				System.out.println(ch + " is consonant");
			}


		sc.close();

	}
}
