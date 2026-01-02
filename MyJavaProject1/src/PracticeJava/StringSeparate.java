package PracticeJava;

public class StringSeparate {
	
	String s1 = "java is a roburst language";
	
	String []s2 = s1.split(" ");
	
	void display() {
		System.out.println(s2);
	}

	

	public static void main(String[] args) {
		
		StringSeparate obj = new StringSeparate();
		obj.display();

	}

}
