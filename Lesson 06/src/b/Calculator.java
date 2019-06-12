package b;

public class Calculator {

	/*
	 * a method ends in one of 2 optional ways:
	 * 
	 * 1. return - all is good
	 * 
	 * 2. throw - something went wrong
	 * 
	 * an exception can be handled in one of 2 ways:
	 * 
	 * 1. throws declaration - declare that this method might throw in exception in
	 * some cases
	 * 
	 * 2. Supply a handler - an alternative code in case of exception.
	 * 
	 */

	public int div(int a, int b) throws CalculatorException {
		if (b == 0) {
			throw new CalculatorException("cannot divide by zero");
		} else {
			return a / b;
		}
	}

}
