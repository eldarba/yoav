package b.threads;

import java.util.Scanner;

public class Demo5Nudge {

	public static void main(String[] args) {
		NudgerThread nudgerThread = new NudgerThread();
		nudgerThread.start();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter name: ");
		String name = sc.nextLine();
		nudgerThread.interrupt();
		sc.close();
		System.out.println("hello " + name);
	}

}
