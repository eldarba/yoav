package a;

public class EmployeeApp1 {

	public static void main(String[] args) {

		System.out.println("number of persons: " + Person.getCounter());

		Person p1 = new Person(101, "aaa", 33);
		Person p2 = new Person(102, "bbb", 55);
		Person p3 = new Person(103, "ccc", 22);
		Person p4 = new Person();
		Employee e1 = new Employee();

		System.out.println("number of persons: " + Person.getCounter());
	}

}
