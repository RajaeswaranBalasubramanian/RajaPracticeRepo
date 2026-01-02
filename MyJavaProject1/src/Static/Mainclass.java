package Static;

public class Mainclass {

	public static void main(String[] args) {
		University univ = new University("Jawahal Nehru Unviersity");
		University univ2 = new University("Rajiv Ghandi Technology");
	
		univ.univ();
		univ2.univ();
		
		University.country = "America";
		
		University univ3 = new University("California State Unviersity");
		University univ4 = new University("Texas State Unviersity");
		
		univ3.univ();
		univ4.univ();
		

	}

}
