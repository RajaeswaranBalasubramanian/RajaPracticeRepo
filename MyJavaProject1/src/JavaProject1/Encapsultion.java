package JavaProject1;

public class Encapsultion {

	public static void main(String[] args) {

		Account acc = new Account();
		acc.setAccountHolderName("Raja");
		acc.setBalance(1293);
		acc.setBalance(-8980);

		System.out.println("Account Holder Name : " +acc.getAccountHolderName());
		System.out.println("Balance : " +acc.getBalance());
	}

}
