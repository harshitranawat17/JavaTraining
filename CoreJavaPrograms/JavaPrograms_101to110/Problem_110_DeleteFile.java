package JavaPrograms_101to110;

import java.io.File;

public class Problem_110_DeleteFile {
	public static void main(String[] args) {

	    File file = new File("/home/harshit_ranawat/NetBeansProjects/Java Practice/JavaPractice/src/JavaPrograms_101to110/File.txt");

	    boolean value = file.delete();
	    
	    if(value) {
	      System.out.println("successfully deleted.");
	    }
	    else {
	      System.out.println("File doesn't exit");
	    }
	  }
}
