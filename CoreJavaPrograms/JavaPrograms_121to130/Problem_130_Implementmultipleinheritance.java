package JavaPrograms_121to130;

interface FirstInterface {
 void firstMethod();
}

interface SecondInterface {
 void secondMethod();
}

//multiple inheritance
class CombinedClass implements FirstInterface, SecondInterface {

 @Override
 public void firstMethod() {
	 
    	 System.out.println("firstmethod");
 	 }
 
 @Override
 public void secondMethod() {
	 System.out.println("second method");
 }
}

public class Problem_130_Implementmultipleinheritance {
	public static void main(String[] args) {
		
		CombinedClass cc = new CombinedClass();
        cc.firstMethod();
        cc.secondMethod();
		
	}
}
