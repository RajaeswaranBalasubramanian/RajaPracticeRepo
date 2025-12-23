package Final;

public class Final {

	public static void main(String[] args) {
		
		Bank obj1 = new Bank();
		obj1.showIFSC();
		
		SBIBANK obj = new SBIBANK();
		obj.showIFSC(); //Will get compilation error because in this class we have inherit the Final Method

	}

}
