package JavaPrograms_71to80;

public class Problem_71_ConvertByteArraytoHexadecimal {
	
	 public static void main(String[] args) {

	        byte[] bytes = {2, 9, 10, 15};

	        for (byte b : bytes) {
	            String st = String.format("%02X", b);
	            System.out.print(st);
	        }
	    }
}
