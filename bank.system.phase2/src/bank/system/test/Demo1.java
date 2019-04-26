package bank.system.test;

import bank.system.Account;
import bank.system.Client;

public class Demo1 {

	public static void main(String[] args) {
		Client cl1 = new Client(101, "aaa", 50_000);
		Client cl2 = new Client(102, "bbb", 20_000);

		cl1.addAccount(new Account(111, 150_000));
		cl1.addAccount(new Account(222, 20_000));

		cl1.deposit(100);
		cl1.withdraw(20);

		System.out.println(cl1.getBalance());
		System.out.println(cl1.getFortune());

	}

}
