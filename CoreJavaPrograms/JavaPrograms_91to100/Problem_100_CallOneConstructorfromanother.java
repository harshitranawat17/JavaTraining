package JavaPrograms_91to100;

public class Problem_100_CallOneConstructorfromanother {
	
		private String name;
		private int age;

	    public Problem_100_CallOneConstructorfromanother() {
	    	
	        this("Harshit Ranawat", 25);
	    }

	    public Problem_100_CallOneConstructorfromanother(String name, int age) {
	    	
	        this.name = name;
	        this.age = age;
	    }

	    public void displayInfo() {
	    	
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	
	
	
	public static void main(String[] args) {
		
		Problem_100_CallOneConstructorfromanother obj = new Problem_100_CallOneConstructorfromanother();
		obj.displayInfo();
	}
}
