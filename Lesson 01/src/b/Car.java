package b;

public class Car {

	public void drive() {
		System.out.println("drive like a car");
	}

	// static nested class
	public static class RaceCar extends Car {
		@Override
		public void drive() {
			System.out.println("drive like a race car");
		}

		public void turbo() {
			System.out.println("turbo");
		}
	}

}
