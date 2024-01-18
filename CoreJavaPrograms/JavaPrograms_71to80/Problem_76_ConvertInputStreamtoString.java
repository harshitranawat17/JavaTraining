package JavaPrograms_71to80;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Problem_76_ConvertInputStreamtoString {
	
	public static void main(String[] args) {
        try {
        	InputStream stream = new ByteArrayInputStream("Hello Harshit here!".getBytes());

            String result = convertInputStreamToStringUsingBufferedReader(stream);

            System.out.println("Converted String:\n" + result);
        } catch (IOException e) {
            System.err.println("error occur: " + e.getMessage());
        }
    }
	
	private static String convertInputStreamToStringUsingBufferedReader(InputStream inputStream) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            return stringBuilder.toString();
        }
    }
}
