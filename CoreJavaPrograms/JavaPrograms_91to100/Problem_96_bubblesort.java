package JavaPrograms_91to100;

import java.util.Scanner;

public class Problem_96_bubblesort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {36,19,29,12,5};
		System.out.println("1. assending, \n2. decsending");
		int input = sc.nextInt();
		
		int i,j,flag=0, temp;
		
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length-1-i;j++) {
				
			 if(input == 1) {	
				//for assending order
				if(arr[j] > arr[j+1]) {
					
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					flag = 1;
				}
			 }
			 else {
				//for decending order
				if(arr[j] < arr[j+1]) {
						
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
						
					flag = 1;
				}
			 }
			}
			
			if(flag == 0) {
				break;
			}
		}
		
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ,");
		}
	}
}
