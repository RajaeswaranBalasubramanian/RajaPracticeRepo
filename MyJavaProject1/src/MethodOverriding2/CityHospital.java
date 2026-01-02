package MethodOverriding2;

public class CityHospital extends Hospital {
	
	public void emergencyservice() {
		super.emergencyservice();
		System.out.println("Admit it");
	}

	public static void main(String[] args) {
		CityHospital obj = new CityHospital();
		obj.emergencyservice();
	}

}
