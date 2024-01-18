package JavaPrograms_101to110;

interface MyFunctionalInterface {
    void myMthd(String s);
}

public class Problem_102_passlambdaexpressionasmethodargument {
	
	public static void processString(String str, MyFunctionalInterface functionalInterface) {
        functionalInterface.myMthd(str);
    }
	
	public static void main(String[] args) {

        processString("Hello!", (s) -> System.out.println("Message: " + s));
         
        processString("Method Reference!", Problem_102_passlambdaexpressionasmethodargument::printMessage);
   
	}
	
	public static void printMessage(String message) {
        System.out.println("Printed Message: " + message);
    }
}
