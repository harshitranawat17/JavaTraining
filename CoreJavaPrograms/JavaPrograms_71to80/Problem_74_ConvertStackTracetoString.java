package JavaPrograms_71to80;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Problem_74_ConvertStackTracetoString {
	
	public static void main(String[] args) {
        try {
            int result = divide(10, 0);
        } catch (Exception e) {
            String stackTraceString = getStackTraceAsString(e);

            System.out.println("Stack Trace as String:\n" + stackTraceString);
        }
    }

    private static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }

    private static String getStackTraceAsString(Throwable throwable) {
    	
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        throwable.printStackTrace(printWriter);

        return stringWriter.toString();
    }
}
