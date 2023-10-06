package com.interfaces;

interface TaxPay
{
   String cname="India";
   
   void taxamount();

}

class Celebrity implements TaxPay
{
	String celebname;
	float income;
	
	public Celebrity() {
		
	}

	public Celebrity(String celebname, float income) {
		super();
		this.celebname = celebname;
		this.income=income;
	}

	@Override
	public void taxamount() {
	 		// 20% 
		System.out.println("Celebrity Amount of tax:"+(0.2*income));
		
	}

}

class Employee implements TaxPay
{
    String ename;
    float salary;
	public Employee() {
		super();
		
	}
	public Employee(String ename, float salary) {
		super();
		this.ename = ename;
		this.salary = salary;
	}
	
	@Override
	public void taxamount() {
		 
		if(salary>500000)
		{
			System.out.println("Celebrity Amount of tax:"+(0.1*salary));
		}
		
		else
		{
			System.out.println("Your salary is tax free");
		}
		
	}
    
    

}

public class InterfaceDemo2 {
	
	public static void main(String[] args) {
		
		Celebrity c1= new Celebrity("Amitabh", 200000);
		c1.taxamount();
		
		Employee e1= new Employee("Shuruti",600000);
		e1.taxamount();
		
		
	}

}
