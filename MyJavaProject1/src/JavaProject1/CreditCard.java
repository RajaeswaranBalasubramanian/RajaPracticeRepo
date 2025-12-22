package JavaProject1;

public class CreditCard implements Interface {
	
	public void makepayment() {
		System.out.println(10000);
	}
	
	public void paymentmessage() {
		System.out.println("Received via CreditCard");
	}
	

	public static void main(String[] args) {
		
		Interface ref = new CreditCard();
		Interface ref1 = new UPI();
		ref.makepayment();
		ref.paymentmessage();
		ref1.makepayment();
		ref1.paymentmessage();

	}

}
