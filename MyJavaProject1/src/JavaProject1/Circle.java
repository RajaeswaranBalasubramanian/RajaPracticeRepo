package JavaProject1;

public class Circle extends Shape {
	
	int radius = 20;
	int diameter = 10;
	
	void area() {
		double area = radius * radius * Math.PI;
		System.out.println("It is Cirle with area : " +area);
	}

}
