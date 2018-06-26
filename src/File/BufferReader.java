package File;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReader {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new
		        InputStreamReader(System.in));
		
		System.out.println("Enter the 1st number:");
		
		Integer num1 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter 2nd number:");
		
		Integer num2 = Integer.parseInt(br.readLine());
		
		int subtract=num1-num2;
		
		System.out.println("Result after subtraction is:"+subtract);

	
	br.close();
	}
	}