package JavaPrograms_71to80;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Problem_77_ConvertOutputStreamtoString {
	
	 public static void main(String[] args) throws IOException {

	        ByteArrayOutputStream stream = new ByteArrayOutputStream();
	        String line = "Hello Harshit here!";

	        stream.write(line.getBytes());
	        String finalString = new String(stream.toByteArray());

	        System.out.println(finalString);
	    }
}
