package General;

public class ImmutableClass {
	
	
	final String name;
	
	final int rollno;
	
	public ImmutableClass(String name, int rollno){  
	
	   this.name=name;
		
		this.rollno=rollno; 
		
	}  
	
	public String getName(){  
		return name;  
		}
	
	public int getrollNumber(){  
	
		return rollno;  
	} 
	
	public static void main(String args[]){
		
		ImmutableClass newstudent = new ImmutableClass("DIPTI",12345);
		
		System.out.println(newstudent.name);
		
		System.out.println(newstudent.rollno);
		
	}
}