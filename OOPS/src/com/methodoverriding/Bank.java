package com.methodoverriding;


	class Account
	{
	   private int accNo;
	   private String name;
	   protected float balance;
	   protected float rateOfInterest;
	   
	   public Account()
	   {
		   
		}

		public Account(int accNo, String name, float balance) {
			super();
			this.accNo = accNo;
			this.name = name;
			this.balance = balance;
		}

		public int getAccNo() {
			return accNo;
		}

		public void setAccNo(int accNo) {
			this.accNo = accNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getBalance() {
			return balance;
		}

		public void setBalance(float balance) {
			this.balance = balance;
		} 
		
		public float getRateOfInterest()
		{
			rateOfInterest=5f;
			return rateOfInterest;
			
		}
		
		void deposit(float amount)
		{
		     balance+=amount;
		 }
		
		void withdraw(float amount)
		{
			if((balance-amount)>0)
			{
				balance-=amount;
			}
			else
			{
				System.out.println("Insufficient balance:"+balance);
			}
			
			
		}
	  

	}

	class SavingAccount extends Account
	{
	    private String panNumber;
	    
		public SavingAccount()
		{
			super();
			
		}
		
		public SavingAccount(int accNo, String name, float balance)
		{
			super(accNo, name, balance);
				
		}

		public SavingAccount(int accNo, String name, float balance, String panNumber) {
			super(accNo, name, balance);
			this.panNumber=panNumber;
		
		}

		public String getPanNumber() {
			return panNumber;
		}

		public void setPanNumber(String panNumber) {
			this.panNumber = panNumber;
		}
		
		
		public float getRateOfInterest()
		{
			rateOfInterest=8.5f;
			return rateOfInterest;
			
		}
		
		void deposit(float amount)
		{
		    float b= balance+amount;
		    if(b>50000)
		    {
		    	if(panNumber != null)
		    	{
		    		balance=b;
		    	}
		    	else
		    	{
		    		System.out.println("Please enter your pan Number as your balance is getting above 50000");
		    	}
		    }
		 }
		
		void withdraw(float amount)
		{
			if((balance-amount)>1000)
			{
				balance-=amount;
			}
			else
			{
				System.out.println("Insufficient balance:"+balance);
			}
			
			
		}
		
		              
		
		
	}

	public class Bank {
		
		public static void main(String[] args) {
			
			Account a1= new Account(1011, "Dipti", 1000);
			
			System.out.println("Account Details:"+a1.getAccNo()+" "+a1.getBalance());
			
			System.out.println("Rate:"+a1.getRateOfInterest());
			
			a1.withdraw(900);
			System.out.println("Balance:"+a1.getBalance());
			
			a1.deposit(67000);
			System.out.println("Balance:"+a1.getBalance());
			
			System.out.println("--------------------------------------------------");
			
			SavingAccount s1= new SavingAccount(10211, "Neha", 20000);
			
	        System.out.println("Account Details:"+s1.getAccNo()+" Balance:"+s1.getBalance());
			
			System.out.println("Rate:"+s1.getRateOfInterest());
			
			s1.withdraw(19500);
			System.out.println("Balance:"+s1.getBalance());
			
			s1.deposit(67000);
			System.out.println("Balance:"+s1.getBalance());
			
			s1.setPanNumber("AC90GH67");
			s1.deposit(67000);
			System.out.println("Balance:"+s1.getBalance());
			
			
			
			
			
			
			
		}

	}


