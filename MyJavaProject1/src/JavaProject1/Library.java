package JavaProject1;

public class Library {
	
	String LibraryName;
	
	Library(){
		System.out.println("Welcome to the Library!");
	}
	
	Library(String LibraryName){
		this();
		this.LibraryName = LibraryName;
		
	}
	
	void display() {
		System.out.println("LibraryName : " +LibraryName);
		
		System.out.println("This library is located in Mumbai");
		
	}
	
	public static void main(String[] args) {
		
	      Library book = new Library("NehruLibrary ");
	      book.display();
	      
	      

	}

}
