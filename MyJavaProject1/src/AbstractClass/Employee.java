package AbstractClass;

abstract class Employee {
	
	abstract double calculatesalary ();
	
	String name;
	int empid;
	
	public void employeedetails(String name, int empid){
		this.name=name;
		this.empid=empid;
		
		System.out.println("Name : " +name);
		System.out.println("EmpId : " +empid);
	}



}
