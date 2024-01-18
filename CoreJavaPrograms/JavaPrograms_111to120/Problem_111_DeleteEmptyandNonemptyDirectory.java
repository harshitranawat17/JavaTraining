package JavaPrograms_111to120;

import java.io.File;

public class Problem_111_DeleteEmptyandNonemptyDirectory {
	public static void main(String[] args) {

	    try {

	      File directory = new File("/home/harshit_ranawat/NetBeansProjects/Java Practice/JavaPractice/src/JavaPrograms_12321to110");

	      File[] files = directory.listFiles();

	      for(File file : files) {
	        System.out.println(file + " deleted.");
	        file.delete();
	      }

	      if(directory.delete()) {
	        System.out.println("Directory Deleted");
	      }
	      else {
	        System.out.println("Directory not Found");
	      }

	    } catch (Exception e) {
	      e.getStackTrace();
	    }
	  }
}
