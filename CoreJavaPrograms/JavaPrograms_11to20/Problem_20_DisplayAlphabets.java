package JavaPrograms_11to20;

public class Problem_20_DisplayAlphabets {
	public static void main(String[] args) {
		int num = 65;
		
		for(int i=0; i<26; i++) {
			System.out.print((char)num++ +" ,");
		}
	}
}
