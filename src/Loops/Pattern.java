package Loops;

import java.util.Scanner;

import java.util.Scanner;

public class Pattern {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows you want in this pattern :");
		
		int rows = sc.nextInt();
		
		for(int i =0; i<= rows; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");

			}
			
			System.out.println();

		}
		
		
	}

}

		
	