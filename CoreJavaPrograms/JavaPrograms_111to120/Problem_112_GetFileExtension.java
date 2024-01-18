package JavaPrograms_111to120;

import java.io.File;

public class Problem_112_GetFileExtension {
	
	public static void main(String[] args) {
	    File file = new File("/home/harshit_ranawat/NetBeansProjects/Java Practice/JavaPractice/src/JavaPrograms_101to110/File.txt");

	    String fileName = file.toString();

	    int index = fileName.lastIndexOf('.');
	    
	    if(index > 0) {

	      System.out.println("File extension is " + fileName.substring(index + 1));
	    }
	  }
}
