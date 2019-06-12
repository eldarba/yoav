package a;

import a.Car.Engine;

public class Test {

	public static void main(String[] args) {
		System.out.println(Car.Color.BLUE);

		Car c1 = new Car();
		Engine e1 = c1.new Engine();
	}

}
