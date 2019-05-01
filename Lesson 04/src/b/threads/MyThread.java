package b.threads;

public class MyThread extends Thread {

	// CTOR
	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(this.getName() + ": " + i);
		}
	}

}
