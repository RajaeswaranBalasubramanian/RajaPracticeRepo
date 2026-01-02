package Hierarchicalinheritance;

public class Arts extends Course {
	
	public void history() {
		System.out.println("Geography & Civics");
	}

	public static void main(String[] args) {
		
		Arts n = new Arts();
		
		n.CourseInfo();
		n.history();

	}

}
