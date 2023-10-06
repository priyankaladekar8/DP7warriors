package Static.java;

 class Company{
	 private  int id;
	 private  String name;
	 private  int salary;
	 static  String companyName;
	 static int cCount=0;
	 
	 static 
	 {
		companyName="Thinkquotint";
		
	 }
	 static void changName(String cName)
	 {
		 companyName=cName;
	 }
	 Company()
	 {
		 
	 }
	 Company(int id, String name, int salary )
	 {
		 this.id=id;
		 this. name=name;
		 this.salary=salary;
	 }
	 public void setCompanyId(int id)
	 {
		 this.id=id;
	 }
	 public  int getCompanyId()
	 {
		 return id;
	 }
	 public void setSalary(int salary)
	 {
		 this.salary=salary;
	 }
	 public void getSalary()
	 {
		 return Salary;
	 }
	 public  static void setComapanyName(String CompanyName)
	 {
		 this.name=companyName;
	 }
	 public static String getComapanyName()
	 {
		 return companyName;
	 }
	  
	 public String toString() 
	 
	    {
	    	return id+" "+name+""+companyName;
	    }
	}

	public class Employee {
		
		public static void main(String[] args) {
			Employee e1=new Employee();
			
			System.out.println("Company name:"+Employee getCompanyname());
			System.out.println("Employee count:"+ccount);
			
			ComapnyName.Name("Scaler");
			
	 
		}
	}
	
	 
	 
	 
