package a;

public class Person {

	// fields
	// attributes, instance variables
	private final int id; // instance constant
	private String name;
	private int age;

	// class variable
	private static int counter;

	// class constant
	public static final int MAX_AGE = 120;

	// CTOR 1
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// CTOR 2
	public Person() {
		super();
		this.id = -1;
	}

	{ // initializer - runs before CTOR on each instantiation
		counter++;
		System.out.println("instance created");
	}

	static {
		System.out.println("class loaded");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// instance method
	public int getId() {
		return id;
	}

	// class method
	public static int getCounter() {
		return counter;
	}

}
