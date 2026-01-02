package AbstractClass;

public class Parttime extends Employee{
	
	public int hoursworked;
	public int hourlypay;
	
	public void calc (String name, int empid, int hoursworked, int hourlypay ) {
		super.employeedetails(name, empid);
		this.hoursworked = hoursworked;
		this.hourlypay = hourlypay;
	}
	
	double calculatesalary() {
		return hoursworked*hourlypay;
	}
     
	void display() {
		System.out.println("Salary : " +calculatesalary());
		System.out.println("------------------------------");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
