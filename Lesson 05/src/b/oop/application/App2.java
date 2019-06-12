package b.oop.application;

import b.oop.Superman;
import b.oop.animals.Butterfly;
import b.oop.animals.Hawk;
import b.oop.interfaces.Flyer;
import b.oop.interfaces.SuperFlyer;

public class App2 {

	public static void main(String[] args) {
		Flyer[] flyers = new Flyer[3];
		flyers[0] = new Butterfly();
		flyers[1] = new Hawk();
		flyers[2] = new Superman();

		for (Flyer flyer : flyers) {
			flyer.fly();
			if (flyer instanceof SuperFlyer) {
				SuperFlyer sf = (SuperFlyer) flyer;
				sf.takeOff();
				sf.land();
				sf.navigate();
			}

			System.out.println("==============");
		}

	}

}
