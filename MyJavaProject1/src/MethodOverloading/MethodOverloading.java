package MethodOverloading;

public class MethodOverloading {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		int intresult = calc.add(24, 84);
		System.out.println("Sum of Integers : " + intresult);
		
		int intresult2 = calc.add(67, 129, 320);
		System.out.println("Result of three integers : " + intresult2);
		
		double intresult3 = calc.add(27.840, 67.948);
	     System.out.println("Result of two Double : " + intresult3);
		
	    double intresult4 = calc.add(98.909, 123.900, 940.900);
	      System.out.println("Result of three Double : " + intresult4);

	
		
	}

}
