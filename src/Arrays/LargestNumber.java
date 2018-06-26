package Arrays;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String args[])
	{
		
		int n,large_num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements in the array:");
		
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter elements of array:");
		
		for(int i = 0;i < n; i++)
		{
			a[i] = sc.nextInt();
		}
	
		large_num =a[0];
		
		for (int i =1; i < n;i++)
		{
			if (a[i] > large_num)
			{
				large_num = a[i];
			}
		}
		
		System.out.println("Largest number in the given array:"+large_num);
	
	}
	
}
