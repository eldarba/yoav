package b.oop.animals;

import b.oop.interfaces.Flyer;
import b.oop.interfaces.Navigator;

public class Hawk extends Animal implements Flyer, Navigator {

	@Override
	public void speak() {
		System.out.println("speak like a Hawk");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like a Hawk");
	}

	@Override
	public void fly() {
		System.out.println("fly like a Hawk");
	}

}
