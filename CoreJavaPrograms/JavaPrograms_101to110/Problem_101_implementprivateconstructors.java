package JavaPrograms_101to110;

class Test {

	  //private constructor
	  private Test () {
	    System.out.println("This is a private constructor");
	  }

	  public static void instanceMethod() {

	    Test obj = new Test();
	  }

}


public class Problem_101_implementprivateconstructors {
	
	public static void main(String[] args) {

	    Test.instanceMethod();
	  }
}
