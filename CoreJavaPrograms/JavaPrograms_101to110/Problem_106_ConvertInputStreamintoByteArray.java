package JavaPrograms_101to110;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class Problem_106_ConvertInputStreamintoByteArray {
	
	public static void main(String args[]) {

	    try {

	      byte[] input = {1, 2, 3, 4};
	      InputStream stream = new ByteArrayInputStream(input);
	      System.out.println("Input Stream: " + stream);

	      byte[] array = stream.readAllBytes();
	      System.out.println("Byte Array: " + Arrays.toString(array));

	      stream.close();
	    }

	    catch (Exception e) {
	      e.getStackTrace();
	    }
	  }
}
