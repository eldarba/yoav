package b.threads;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("Hello World");

		// get a reference to the currently running thread object
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName());
	}

}
