package JavaProject1;

public class Product {
	
	int ProductID;
	String ProductName;
	int ProductPrice;
	
	Product (){
	System.out.println("Product Created");
	}
	
	Product (int ProductID){
		this.ProductID = ProductID;
	}
	
	Product (int I,String N){
		ProductID = I;
		ProductName = N;
	}
	
	Product (int I,String N,int P){
		ProductID = I;
		ProductName = N;
		ProductPrice = P;
	}
	
	void display() {

		System.out.println("ProductID : " + ProductID);
		System.out.println("ProductName : " + ProductName);
        System.out.println("ProductPrice : " +	ProductPrice);
        System.out.println("-------------------------");
        
	}

}
