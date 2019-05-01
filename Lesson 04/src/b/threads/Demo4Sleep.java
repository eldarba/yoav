package b.threads;

public class Demo4Sleep {

	public static void main(String[] args) {
		System.out.println("one");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("two");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("three");
	}
}
