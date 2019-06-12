package b.oop.application;

import b.oop.animals.Animal;
import b.oop.animals.Butterfly;
import b.oop.animals.Dog;
import b.oop.animals.Hawk;
import b.oop.interfaces.Flyer;
import b.oop.interfaces.Navigator;

public class App1 {

	public static void main(String[] args) {

		Animal[] animals = new Animal[3];

		animals[0] = new Dog();
		animals[1] = new Butterfly();
		animals[2] = new Hawk();

		for (int i = 0; i < animals.length; i++) {
			animals[i].speak();
			if (animals[i] instanceof Flyer) {
				Flyer flyer = (Flyer) animals[i];
				flyer.fly();
			}
			if (animals[i] instanceof Navigator) {
				Navigator navigator = (Navigator) animals[i];
				navigator.navigate();
			}
			System.out.println("=========");
		}
	}
}
