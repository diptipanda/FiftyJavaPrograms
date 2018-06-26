package ExceptionHandling;

public class NullPointer {

	@SuppressWarnings("null")
	
	public static void main(String args[])
	{
		String str=null;
		try{
			if (str.equals("entered"))
				
                System.out.print("Same");
			
            else
            	
                System.out.print("Not Same");
			
			
		}catch(NullPointerException e){
			
			System.out.println("NullPointerException arised..");
		}
	}
	}

