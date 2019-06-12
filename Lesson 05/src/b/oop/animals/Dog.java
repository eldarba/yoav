package b.oop.animals;

import b.oop.interfaces.Navigator;

public class Dog extends Animal implements Navigator {

	@Override
	public void speak() {
		System.out.println("speak like a Dog");

	}

	@Override
	public void navigate() {
		System.out.println("navigate like a Dog");
	}

}
