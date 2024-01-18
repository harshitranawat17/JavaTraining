package JavaPrograms_101to110;

public class Problem_103_passmethodcallasargumentstoanothermethod {

	  public int add(int a, int b) {
	    int sum = a + b;
	    return sum;
	  }

	  public void square(int num) {
	    int result = num * num;
	    System.out.println(result);  
	  }
	  public static void main(String[] args) {

		Problem_103_passmethodcallasargumentstoanothermethod obj = new Problem_103_passmethodcallasargumentstoanothermethod();

	    obj.square(obj.add(15, 9));

	  }
}
