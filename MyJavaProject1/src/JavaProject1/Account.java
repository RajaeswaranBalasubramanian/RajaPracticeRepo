package JavaProject1;

public class Account {

	private String AccountHolderName;
	private double Balance;
	
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	
	
	public void setAccountHolderName (String AccountHolderName) {
		this.AccountHolderName = AccountHolderName;
	}
	
	
	public double getBalance() {
		return Balance;
		
	}
	
	
	public void setBalance(double Balance) {
      
		if (Balance < 0)
			
		{
			System.out.println("Balance Cannot be in Negative value");
		}
		
		else 
			
			this.Balance = Balance;
	

	}
	

}
