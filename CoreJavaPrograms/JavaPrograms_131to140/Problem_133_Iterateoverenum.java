package JavaPrograms_131to140;

enum name{
	Harshit, Roshan, Jigyasa, Abhigyan
}

public class Problem_133_Iterateoverenum {
		public static void main(String[] args) {
			System.out.println("Elements of enum: ");
			
			for(name n : name.values()) {
				System.out.print(n+ " ,");
			}
		}
}
