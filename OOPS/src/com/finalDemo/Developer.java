package com.finalDemo;

public class Developer {
	final int noofhours = 8;
	final String cname;
	final float salary;
	String ename;

	{
		// noofhours=10;
		cname = "hcl";
	}

	public Developer() {
		salary = 10000.0f;
	}

	public Developer(String ename, float salary) {
		this.ename = ename;
		this.salary = salary;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getSalary() {
		float salary;
	}

	void Skills() {
		System.out.println("html, css,c ,c++, java");
	}
}

class FullStackDeveloper extends Developer
{
	System.out.println("angular, react , springboot");
}



   class Company {

	public static void main(String args[]) {
		Developer d = new Developer();
		System.out.println(d.cname + " " + d.ename + " " + d.salary);
		d.setEname("priyanka");
		System.out.println(d.cname + " " + d.ename + " " + d.salary);
		Developer d1 = new Developer("dipati", 2300.0f);
		System.out.println(d1.cname + " " + d1.ename + " " + d1.salary);
	}

}


