package b.oop.animals;

import b.oop.interfaces.Flyer;

public class Butterfly extends Animal implements Flyer {

	@Override
	public void speak() {
		System.out.println("speak like a Butterfly");

	}

	@Override
	public void fly() {
		System.out.println("fly like a Butterfly");

	}

}
