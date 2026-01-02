package AbstractClass;

public class Abstract {

	public static void main(String[] args) {
		
		Parttime obj = new Parttime();
		obj.calc("Manish", 111, 90, 1500);
		obj.display();
		
		Fulltime jpg = new Fulltime();
		jpg.mothlysalary("Raja", 101, 40000);
		jpg.display();

	}

}
