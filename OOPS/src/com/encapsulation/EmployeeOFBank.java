package com.encapsulation;  //Employee.java
   
public class EmployeeOFBank {

	// instance variable

	private int EmployeeId;
	private String Ename;
	private float Salary;
	private String Designation;

	// getters and setters : public

	public void setEmployeeId(int EmployeeId) {
		this.EmployeeId = EmployeeId;
	}

	public int getEmployeeId() {
		return EmployeeId; // can write this.bookId
	}

	public void setEname(String Ename) {
		this.Ename = Ename;
	}

	public String getEname() {
		return Ename;
	}

	public void setSalary(float Salary) {
		this.Salary = Salary;
	}

	public float getSalary() {
		return Salary;
	}
	/*
	 * public void display() { System.out.println(bookId+" "+bname+" "+price); }
	 */

	public String toString() {
		return "EmployeeId:" + EmployeeId + " Employee Name:" + Ename + "  Salary:" + Salary + "Designation:"
				+ Designation;
	}

}
