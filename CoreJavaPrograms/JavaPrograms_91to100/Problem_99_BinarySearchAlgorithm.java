package JavaPrograms_91to100;

import java.util.Scanner;

public class Problem_99_BinarySearchAlgorithm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {2,5, 7, 9,12,14,16,17,19,20,24,28};
		System.out.println("enter number to search: ");
		int srch = sc.nextInt();
		int li = 0;
		int hi = arr.length-1;
		int mi = (li+hi)/2;
		
		while(li<=hi) {
			if(arr[mi] == srch) {
				System.out.println("element is at "+mi+" index position");
				break;
			}
			else if(arr[mi]<srch) {
				li = mi+1;
			}
			else {
				hi = mi-1;
			}
			mi = (li+hi)/2;
		}   
		if(li>hi) {
			System.out.println("element not found");
		}
		sc.close();
	}
}
