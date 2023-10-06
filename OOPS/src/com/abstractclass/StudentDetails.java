package com.abstractclass;


abstract class Stduent{
	private int id;
	private String name;
	
	 public Stduent()
	{
		
	}
	public Stduent(int id,String name)
	{
		super();
		this.id=id;
		this.name=name;
	}
	
	abstract void description();
	
	 void display()
	{
		System.out.println("Name"+name);
		System.out.println("Id"+id);
	}
}
 class SchoolStudent extends Student{
	private String sname;
	private float fees;
	
	SchoolStudent()
	{
		
	}
	public SchoolStudent( int id, String name, String sname, float fees)
	{
		super(id,name);
		this.sname=sname;
		this.fees=fees;
		
	}
	@Override
	
	 void description();
	void display()
	{
		System.out.println("sname:"+sname);
		System.out.println("fees:"+fees);
	}
	
	
}
	
	
	
	
	
}

public class StudentDetails {

}
