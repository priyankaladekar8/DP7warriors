package com.encapsulation;

import java.util.Scanner;//customerBank

public class Bank {
	public static void main(String args[]) {
		CustomerBank b1 = new CustomerBank();
		b1.setId(454);
		b1.setName("priyanka");
		b1.setAccno(987654);
		b1.setBalance(200000);

		System.out.println(b1.getId() + " " + b1.getName() + " " + b1.getAccno() + " " + b1.getBalance());

		Scanner sc = new Scanner(System.in);
		System.out.println("what transaction you want to creadited or debited");
		char t = sc.next().charAt(0);

		double balance1;

		if (t == 'c') {
			System.out.println("how much amount you want to credit:");
			int credit = sc.nextInt();
			balance1 = b1.getBalance();
			balance1 = balance1 + credit;
			b1.setBalance(balance1);
			System.out.println("Available balance" + balance1);
		} else {
			System.out.println("how much amount you want to debit:");
			int credit = sc.nextInt();
			balance1 = b1.getBalance();
			balance1 = balance1 - credit;
			b1.setBalance(balance1);
			System.out.println("Available balance" + balance1);
		}

	}
}
