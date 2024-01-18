package JavaPrograms_111to120;

final class ImmutablePerson {
	
	private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
	
}


public class Problem_120_CreateImmutableClass {
	public static void main(String[] args) {

        ImmutablePerson person = new ImmutablePerson("Harshit", 25);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

    }
}
