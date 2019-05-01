package a.collections;

public class CastingAndRandom {

	public static void main(String[] args) {

		System.out.println(Math.random());
		System.out.println(Math.random() * 10);
		System.out.println((int) (Math.random() * 10));

		int r = (int) (Math.random() * 11);
		System.out.println(r);

		// random 20 - 30
		System.out.println(r + 20);

	}

}
