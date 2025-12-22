package JavaProject1;

public class ElectricCar extends Vehicle {
	
	public void Fueltype() {
		System.out.println("Runs on electricity");
	}

	public static void main(String[] args) {
		
		Vehicle honda = new Vehicle();
		ElectricCar Tesla = new ElectricCar();
		
		honda.Fueltype();
		Tesla.Fueltype();

	}

}
