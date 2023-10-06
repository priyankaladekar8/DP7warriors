package com.finalDemo;

public class Student {
	private int id;
	private String name;
	protected float fees;
	
	public Student()
	{
		
	}
	public Student(int id,String name,float fees)
	{
		this.id=id;
		this.name=name;
		this.fees=fees;
	}
	public void setId(int id)
	{
		this.id=id;
		
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setFees(float fees)
	{
		this.fees=fees;
	}
	public float getFees()
	{
		return fees;
	}
	public  void payfees()
	{
		System.out.println("your monthly fees is :"+fees);
	}
	public String toString ()
	{
		return "\n id: "+id+"\nname: "+name+"\n fees: "+fees;
	}
}
class CollegeStudent extends Student{
	private int semno;
	private String clgname;
	
	CollegeStudent()
	{
		super();
	}
	CollegeStudent(int id, String name, float fees, int semno,String clgname)
	{
		super(id,name,fees);
		this.semno=semno;
		this.clgname=clgname;
	}
	public void setSemno(int semno)
	{
		this.semno=semno;
	
	}
	public int getSemno()
	{
		return semno;
	}
	public void setClgname(String clgname)
	{
		this.clgname=clgname;
	}
	public String getClgname()
	{
		return clgname;
	}
	public void payfees()
	{
		System.out.println("the monthly fees of collegeStudent is:"+(fees*6));
	}
	class SchooleStudent{
		private int stuid;
		private String schoolname;
		
		SchooleStudent()
		{
		 super();	
		}
		SchooleStudent( int id,String name, float fees, int semno, String schoolname, int stuid,String schoolname);
		{
			super();
			this.stuid=stuid;
			this.schoolname=schoolname;
		}
		
		
	}
	
			
}

	

}
