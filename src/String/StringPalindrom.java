package String;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Please Enter a String");
	String str = in.nextLine();
	String revstring = "";
	
	for(int i = str.length()-1;i>=0;i--){
		revstring += str.charAt(i);
	}
		System.out.println(revstring);
		
if(revstring.equalsIgnoreCase(str)){
	System.out.println("The entered string is pallindrome");
}
else{
	System.out.println("The entered string is not pallindrome");
	}
}

}
