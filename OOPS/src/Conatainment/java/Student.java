package Conatainment.java;

public class Student {
	private int sid;
	private String name;
	private Course course;

	Student()
	{
		
	}
	Student( int sid,String name,Course course)
	{
		this.sid =sid;
		this.name=name;
		this.course=course;
	}
	public int getSid()
	{
		return sid;
		
	}
	public void setSid(int sid)
	{
		this.sid=sid;
	}
	public String name()
	{
		return name;
	}
	public Course getCourse()
	{
		return course;
	}
	public void setCourse(Course course)
	{
		this.course=course;
	}
	public String toString()
	{
		return "\nStudent Details:"+"\n Id:"+sid+"\nName:"+name+"\nCousrse:"+course;
	}

		
	}

	
	

	
	
	

