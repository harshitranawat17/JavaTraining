package JavaPrograms_11to20;

import java.util.Scanner;
public class Problem_11_Leapyear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		
		boolean isleap = leap(year);
		
		if (isleap) {
			System.out.println(year+" is leap year");
		}
		else {
			System.out.println(year+" is not leap year");
		}
		
		sc.close();
	}
	
	public static boolean leap(int year) {
	
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}
}
