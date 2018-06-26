package Arrays;

import java.util.Scanner;

public class LinearSearch 	{

public static void main(String args[]){
	
	int n,search;
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter no of elements you want in the array:");

	n = s.nextInt();
	
	int [] a = new int[n];
	
	System.out.println("Enter all the elements:");
	for ( int i=0; i <n; i++)
		
	{
		a[i] = s.nextInt();
	}
System.out.println("Enter the element to be searched :");

    search = s.nextInt();
    
    for (int i =0;i<n;i++)
    {
    	if(a[i] == search)
    	{
    		System.out.println(search +"is present at location : "  +(i+1));
    	}
    	
    }
}
    	
    }



