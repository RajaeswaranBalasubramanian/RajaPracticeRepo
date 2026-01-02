package AbstractClass;

public class Fulltime extends Employee {
	
	public double mothlysalary;
	
	public void mothlysalary(String name, int empid, double mothlysalary ) {
		super.employeedetails(name, empid);
	    this.mothlysalary = mothlysalary;
	}
	
	double calculatesalary() {
		return mothlysalary;
	}
	
	void display() {
		System.out.println("Salary : " +calculatesalary());
		System.out.println("------------------------------");
	}
	


}
