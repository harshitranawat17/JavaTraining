package JavaPrograms_111to120;

import java.io.File;

public class Problem_113_Getnameoffilefromabsolutepath {
	public static void main(String[] args) {

	    File file = new File("/home/harshit_ranawat/NetBeansProjects/Java Practice/JavaPractice/src/JavaPrograms_101to110/File.txt");

	    String fileName = file.getName();
	    System.out.println("File Name: " + fileName);

	  }
}
