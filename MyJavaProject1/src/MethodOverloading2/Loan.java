package MethodOverloading2;

public class Loan {

	public static void main(String[] args) {
		LoanCalculator obj = new LoanCalculator();
		
		obj.calculateLoan(2500000);
		obj.calculateLoan(2500000, 14.50);
		obj.calculateLoan(2500000, 14.50, 17.90f);

	}

}
