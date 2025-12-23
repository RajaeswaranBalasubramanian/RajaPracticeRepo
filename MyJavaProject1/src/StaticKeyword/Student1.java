package StaticKeyword;

public class Student1 {
	
	static String CollegeName = "SVN College";
	public String Name;
	public int Rollno;
	
	Student1 (String Name, int Rollno){
		this.Name = Name;
		this.Rollno = Rollno;
	}
	
	public void displaydetails(){
		
		System.out.println("CollegeName : " +CollegeName);
		System.out.println("Name : " +Name);
		System.out.println("Rollno : " +Rollno);
		System.out.println("--------------------------------");
		
	}
	
}
