package b.threads;

public class NudgerThread extends Thread {

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(3000);
				System.out.println("נו כבר");
			} catch (InterruptedException e) {
				// if we are here this thread was interrupted
				break;
			}
		}
	}
}
