package com.coupling;

interface Payment {
	public void doTransaction(double amount);
}

class CreditCard implements Payment {
	private int cardNo;
	private int cvv;
	private double limit;

	public CreditCard() {
		super();

	}

	public CreditCard(int cardNo, int cvv, double limit) {
		super();
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.limit = limit;

	}

	@Override
	public void doTransaction(double amount) {
	
		if ((this.limit - amount) > 0) {
			System.out.println("Credit card is debited by:" + amount);
			this.limit = amount;
		} else {
			System.out.println("Insufficient balance:" + this.limit);
		}
	}

	public int gerCardNo() {
		return cardNo;
	}

	public int getCvv() {
		return cvv;
	}
}

class DebitCard implements Payment {
	private int cardNumber;
	private double balance;
	
	public DebitCard() {
		super();
		
	}
	public DebitCard(int cardNumber, double balance) {
		super();
		this.cardNumber=cardNumber;
		this.balance=balance;
		
	}
	

	@Override
	public void doTransaction(double amount) {
		if((this.balance-amount)>=1000)
		{
			System.out.println("Debitcard is debited by:"+amount);
			
		}


	}
}


public class OnlineShoping{
	String name;
	long mno;
	public OnlineShoping()
	{
		super();
	}
	public OnlineShoping(String name, long mno)
	{
		this.name=name;
		this.mno=mno;
		
	}
	public void payBills(Payment p, float amt)
	{
		p.doTransaction(amt);
	}
	public void payBill(Payment p, float amt, float discount)
	{
		amt=amt-((discount/100)*amt);
		p.doTransaction(amt);
	}
	public static void main(String args[]) {
		OnlineShoping customer1= new OnlineShoping("priyanka", 6547898);
		CreditCard c= new CreditCard(2345654, 456, 80000);
		customer1.payBills(c, 56000);
		DebitCard d1=new DebitCard(56765, 50000);
		customer1.payBills(c,  6700.00f);
		
	}
	}
	

