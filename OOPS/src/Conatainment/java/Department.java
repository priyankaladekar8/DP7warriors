package Conatainment.java;

public class Department {
	
	private String post;
	private String name;
	private long phone;
	
	
	Department()
	{
		
	}
	Department( String post,String name,long phone)
	{
		this.post=post;
		this.name=name;
		this.phone=phone; 
	}
	
	public String getPost()
	{
		return post;
	}
	public void setPost(String post)
	{
		this.post=post;
	}
	
	public String getName()
	{
			return name;	
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public long getPhone()
	{
		return  phone;
	}
	public void setPhone(long phone)
	{
		this.phone=phone;
	}
	public String toString()
	{
		return "\nDepartment Details:"+"\npost"+post+"\nname:"+name+"\nphone:"+phone;
	}
	
}

		
		
		
	

	


