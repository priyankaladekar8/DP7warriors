package com.interfaces;

interface Bank{
	void display();
	interface BankLocker{
	void test();
}
}
class SBI implements Bank, Bank.BankLocker{
	public void display() {
		System.out.println("display method is present in the banklocker");
	}
	public void test()
	{
		System.out.println("this is the print mehtod:");
	}
}
public class BankDetails {
	public static void main() {
		SBI s= new SBI();
		s.display();
		s.test();
	}

}
