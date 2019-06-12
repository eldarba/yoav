package b.oop;

import b.oop.interfaces.SuperFlyer;

public class Superman implements SuperFlyer {

	@Override
	public void fly() {
		System.out.println("fly like superman");
	}

	@Override
	public void takeOff() {
		System.out.println("takeOff like superman");
	}

	@Override
	public void land() {
		System.out.println("land like superman");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like superman");
	}

}
