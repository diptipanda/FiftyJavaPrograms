package Loops;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		 int sum=0,a,temp;  
		    int n;
	
		    Scanner in = new Scanner(System.in);
	    
		    System.out.println("Input a number to check if it is an Armstrong number");      
	     
		    n = in.nextInt(); 
		 
		    temp=n;  
		   
		    while(n>0)  
		   
		    {  
		   
		    	a=n%10;  
		   
		    	n=n/10;  
		   
		    	sum=sum+(a*a*a);  
		    }  
		   
		    if(temp==sum)  
		   
		    	System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   
		  	
	}

}
