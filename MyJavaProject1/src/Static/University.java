package Static;

public class University {
	
	static String country = "India";
	String Univname;
	
    University (String Univname){
    	this.Univname = Univname;
    }
    
    void univ() {
    	System.out.println(Univname +" : " +country);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
