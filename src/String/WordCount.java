package String;

public class WordCount {
	
	public static void main(String args[]){
		
		String str = "This Is Nice ";
		
		String word[] = str.split(" ");
		
		 String output ="";
		 
		for(int i=0;i<word.length;i++)
		  {
			 for (i = 1; i <= word.length; i ++) {
			 output += word[i-1] + i + " ";
	      }
		  }
		  System.out.println(output);
		  }
		
	}


