package ConstructorChaining;

public class Mall {
	
	int a;
	int b;
	String cinema;
	Double Price;
	
	
	
	Mall(){
		System.out.println("Welcome to the Mall");
	}
	
	Mall( int a, int b){
		this();
		this.a = a;
		this.b = b;
		display();
		
	}
	
	Mall( int a, int b, String cinema){
		this.a = a;
		this.b = b;
		this.cinema = cinema;
		display();
		
	}
	
	 Mall( int a, int b, String cinema, Double Price){
		this.a = a;
		this.b = b;
		this.cinema = cinema;
		this.Price = Price;
		display();
	}

	 void display(){
		 System.out.println(a +":" +b +":" +cinema +":" +Price);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
