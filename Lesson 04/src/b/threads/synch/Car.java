package b.threads.synch;

public class Car {

	private int km;

	public synchronized void drive(int distance) {
		System.out.println(
				"driver " + Thread.currentThread().getName() + " started at " + km + " for " + distance + " km");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.km += distance;
		System.out.println("driver " + Thread.currentThread().getName() + " finished at " + km);
	}

}
