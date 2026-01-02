package Hierarchicalinheritance;

public class Commerce extends Course {
	
	public void display() {
		System.out.println("Politics & Economics");
	}

	public static void main(String[] args) {
		
		Commerce obj = new Commerce();
		
		obj.CourseInfo();
		obj.display();
		
	}

}
