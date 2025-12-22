package JavaProject1;

public class Task1Employee {
	
	private int EmpID;
	private String Name;
	private double Salary;
	
	public int getEmpID () {
		return EmpID;
		
	}
	
	public void setEmpID (int EmpID) {
		this.EmpID = EmpID;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public double getSalary() {
		return Salary;
	}
	
	public void setSalary(Double Salary) {
		this.Salary = Salary;
	}
	
	public void displaydetails() {
		System.out.println("Employee ID : " + EmpID);
		System.out.println("Employee Name : " + Name);
		System.out.println("Employee Salary : " + Salary);
		
	}
	

	public static void main(String[] args) {
		Task1Employee emp = new Task1Employee();
           
		emp.setEmpID(111);
		emp.setName("Rajaeswaran");
		emp.setSalary(50000.00);
		
		emp.displaydetails();
		
	}

}
