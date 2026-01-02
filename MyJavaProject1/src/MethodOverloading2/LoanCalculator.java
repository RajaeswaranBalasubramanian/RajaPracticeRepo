package MethodOverloading2;

public class LoanCalculator {
      
	public void calculateLoan(int loanamount){
		System.out.println("Loanamount = " +  loanamount);
		
	}
	
	public void calculateLoan(int loanamount, double interestrate) {
		System.out.println("Loanamount = " +  loanamount +" Interestrate = " +  interestrate);
		
	}
	
	public void calculateLoan(int loanamount, double interestrate, float roi) {
		System.out.println("Loanamount = " +  loanamount + " Interestrate = " +  interestrate+ " Roi = " +  roi );
		

	}
	


}
