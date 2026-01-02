package Polymorphism;

public class Polymorphism {

  public static void main(String[] args) {
		
	    Shape shape;
	  
		shape = new Circle1();
		shape.area();
		
		
		shape = new Rectangle();
		shape.area();	
		
		Shape S = new Shape();
		S.area();
		
	}

}
