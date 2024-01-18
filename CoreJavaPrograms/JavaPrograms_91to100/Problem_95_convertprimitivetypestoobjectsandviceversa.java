package JavaPrograms_91to100;

public class Problem_95_convertprimitivetypestoobjectsandviceversa {
	public static void main(String[] args) {

		//primitive to obj
	    int var1 = 7;
	    double var2 = 8.32;
	    boolean var3 = true;

	    Integer obj1 = Integer.valueOf(var1);
	    Double obj2 = Double.valueOf(var2);
	    Boolean obj3 = Boolean.valueOf(var3);

	    if(obj1 instanceof Integer) {
	      System.out.println("True");
	    }

	    if(obj2 instanceof Double) {
	      System.out.println("True");
	    }

	    if(obj3 instanceof Boolean) {
	      System.out.println("True");
	    }
	
	    //obj to primitive
	    
	    int var4 = obj1.intValue();
	    double var5 = obj2.doubleValue();
	    boolean var6 = obj3.booleanValue();
	
	
	}
}
