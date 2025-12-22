package JavaProject1;

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Product p = new Product();
		p.display();
		
		Product p1 = new Product(2444,"Apple",80);
		p1.display();
		
		Product p2 = new Product(2446,"Avacado",80);
		p2.display();
		
		Product p3 = new Product (2334,"Tshirt",300);
		p3.display();

	}

}
