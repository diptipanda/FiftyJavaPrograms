package String;

import java.util.Scanner;

public class StringReverse {
	
	 public static void main(String args[]){
		   Scanner s = new Scanner(System.in);
		   System.out.println("Enter the string");
		   String  input= s.nextLine();
		   
		   
		   String rev ="";
			
			for(int i = input.length()-1; i >= 0;i--){
				
				rev = rev + input.charAt(i);
			
			}
			System.out.println(rev);
	 }
	 
}