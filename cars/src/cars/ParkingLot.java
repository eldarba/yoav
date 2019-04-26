package cars;

public class ParkingLot {
	
	private Car[] cars = new Car[3];
	
	public void insert(Car car) {
		for (int i = 0; i < cars.length; i++) {
			if(cars[i] == null) {
				cars[i] = car;
				System.out.println("car inserted");
				return;
			}
		}
		System.out.println("parking lot is full");
	}

}
