package b;

public class Test {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		int a = 5;
		int b = 0;
		int m;
		try {
			m = c.div(a, b);
			System.out.println(a + " / " + b + " = " + m);
		} catch (CalculatorException e) {
			// handler code:
			System.out.println("sorry, something went wrong: " + e.getMessage());
			// e.printStackTrace();
		} catch (Exception e) {
			System.out.println("some other problem: " + e.getMessage());
			// e.printStackTrace();
		}
		System.out.println("end");

	}

}
