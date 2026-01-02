package ConstructorChaining;

public class Mailclass {

	public static void main(String[] args) {
		Mall m = new Mall(12, 14);//default constructor called with parametrized constructor
		Mall m1 = new Mall(23, 56, "Raja");//Chained constructor
		Mall m2 = new Mall(133, 12, "Ram", 13309d);
	  
	}

}
