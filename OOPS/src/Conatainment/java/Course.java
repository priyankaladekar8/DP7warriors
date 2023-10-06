package Conatainment.java;

public class Course {
	private int cid;
	private String cname;
	private float fees;
	Course()
	{
		
	}
	Course(int cid, String cname, float fees)
	{
		this.cid=cid;
		this.cname=cname;
		this.fees=fees;
	}
	public int getCid()
	{
		return cid;
		
	}
	public void setCid(int cid)
	{
		this.cid=cid;
	}
	public String getCname()
	{
		return cname;
		
	}
	public void setCname(String cname)
	{
		this.cname=cname;
	}
	public float getFees()
	{
		return fees;
		
	}
	public void setFees( float fees)
	{
		this.fees=fees;
	}
	public String toString()
	{
		return "\nCourse details:"+"\n Id:" +cid+"\nName:"+cname+"\nfees:"+fees;
	}
	
	

}
