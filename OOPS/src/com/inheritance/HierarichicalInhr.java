package com.inheritance;

class Student
{
    private int id;
    private String name;
    private float fees;
   
    
	public Student()
	{
		
	}
	public Student(int id, String name, float fees) {
		
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public String toString() {
		return "\nid=" + id + ", name=" + name + ", fees=" + fees;
	}
  
}

class SchoolStudent extends Student
{
    private String schoolName;
    private int std;
    
	public SchoolStudent() 
	{
	
		super();
	}

	public SchoolStudent(int id, String name, float fees, String schoolName, int std) {
		super(id, name, fees);
		this.schoolName = schoolName;
		this.std = std;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	
	public String toString() {
		return "\nSchool Student:"+ super.toString()+", schoolName=" + schoolName + ", std=" + std ;
	}
	
	


}

class CollegeStudent extends Student
{
    private String university;
    private String course;
    private int sem;
    
	public CollegeStudent() 
	{
		super();
		
	}
	public CollegeStudent(int id, String name, float fees, String university, String course, int sem) {
		super(id, name, fees);
		this.university = university;
		this.course = course;
		this.sem = sem;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem)
	{
		this.sem = sem;
	}
	public String toString() {
		return "\nCollege Student:"+ super.toString()+", university= " +university + ", course=" + course + ", sem=" + sem ;
	}
  


}

public class HierarichicalInhr {
	
	public static void enterSchoolstudDetails(SchoolStudent s)
	{
		
	}
	
	public static void main(String[] args) {
		
		SchoolStudent s1= new SchoolStudent(101,"Aniket",23000f,"Heritage",10);
		CollegeStudent c1= new CollegeStudent(201, "Neha", 34000f, "DU", "Btech(Comp)", 3);
		
		System.out.println(s1);
		System.out.println(c1);
		
	}

}
