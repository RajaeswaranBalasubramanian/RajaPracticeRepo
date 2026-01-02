package Hierarchicalinheritance;


public class Science extends Course {
	
	public void subjects() {
		System.out.println("Physics & Chemistry");
	}
	
	public static void main(String[] args) {
		
		Science obj = new Science();
		
	    obj.CourseInfo();
	    obj.subjects();
		
	}

}
