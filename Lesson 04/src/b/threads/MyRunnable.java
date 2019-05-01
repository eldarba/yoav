package b.threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		for (int i = 1; i <= 100; i++) {
			System.out.println(currentThread.getName() + ": " + i);
		}
	}

}
