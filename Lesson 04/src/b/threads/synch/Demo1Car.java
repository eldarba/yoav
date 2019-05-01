package b.threads.synch;

public class Demo1Car {

	public static void main(String[] args) {

		Car car = new Car();
		Car car2 = new Car();

		CarDriver moshe = new CarDriver("Moshe", car, 150);
		CarDriver danna = new CarDriver("Danna", car, 73);
		CarDriver john = new CarDriver("John", car2, 200);

		moshe.start();
		danna.start();
		john.start();

	}
}
