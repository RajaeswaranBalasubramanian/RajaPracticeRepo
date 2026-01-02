package Aggregation;

public class Car {
	
	Engine engine;
	
	Car(Engine engine){
		this.engine = engine;
	}
	
	void engine1() {
		System.out.println("Car Details");
		engine.engineinfo();
	}

	public static void main(String[] args) {
		
		Engine eng = new Engine();
		
		Car c = new Car(eng);
		c.engine1();

	}

}
