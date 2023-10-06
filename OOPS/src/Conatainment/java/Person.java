package Conatainment.java;

public class Person {
	private int id;
	private String name;
	private float salary;
	private Department department;

	
	Person()
	{
		
	}
	Person(int id, String name ,float salary,Department department)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;
		
	}
	public int getId()
	{
		return id;
		
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public float getSalary()
	{
		return salary;
	}
	public void setSalary(float salary)
	{
		this.salary=salary;
	}
	public Department getDepartment()
	{
		return department;
	}
	public void setDepartment(Department department)
	{
		this.department=department;
	}
	
	public String toString()
	{
		return"\nEmployee Details:"+"\n Id:"+id+"\nName:"+name+"\nSalary:"+salary+"\nDepartment:"+department;
	}
	

	}


