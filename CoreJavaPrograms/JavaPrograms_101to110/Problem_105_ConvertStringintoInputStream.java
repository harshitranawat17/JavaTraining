package JavaPrograms_101to110;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Problem_105_ConvertStringintoInputStream {
	public static void main(String[] args) {

        String str = "Hello";

        InputStream is = convertStringToInputStream(str);

        try {
            int data;
            while ((data = is.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {

            try {
                is.close();
            } catch (IOException e) {
                System.err.println("An error occurred : " + e.getMessage());
            }
        }
    }

    private static InputStream convertStringToInputStream(String str) {

        byte[] byteArr = str.getBytes();

        return new ByteArrayInputStream(byteArr);
    }
}
