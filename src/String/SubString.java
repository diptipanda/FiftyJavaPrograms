package String;

public class SubString {
	
	public static void main(String args[]){
		
		
		String str = "Welcome to White box QA ";
		
		String searchString = "Welcome";
		
	    String resultString ;
		
		
		
		if (str.contains(searchString)){
			
			 resultString = str.replace("Welcome", "Hello");
			
			 System.out.println(resultString);
			
		}
		else
		{
			System.out.println("not found");
		}
		
		
			
		}
		
	}
	

