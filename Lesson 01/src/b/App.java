package b;

import b.Car.RaceCar;
import b.State.Citizen;

public class App {

	public static void main(String[] args) {

		State israel = new State("Israel");
		State france = new State("France");

		Citizen c1 = israel.new Citizen("David");
		Citizen c2 = israel.new Citizen("Lea");
		Citizen c3 = israel.new Citizen("Moshe");
		Citizen c4 = france.new Citizen("Pier");

		System.out.println(c1.getName());
		System.out.println(c1.getStateName());
		System.out.println(c4.getName());
		System.out.println(c4.getStateName());

		Car car = new RaceCar();
		car.drive();

		car = new Car();
		car.drive();

	}
}
