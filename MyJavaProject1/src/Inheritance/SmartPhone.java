package Inheritance;

public class SmartPhone extends Mobile {
	
	public void Internet() {
		
		System.out.println("Device Connected to Internet");
	}
	
	public static void main(String[] args) {
		
		SmartPhone s = new SmartPhone();
		
		s.start();
		s.Calling();
		s.Internet();

	}

}
