package Loops;


	
	import java.util.Scanner;

	public class FizzBuzz {
	 public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number to check");
		int n= scanner.nextInt();
		if((n%3==0)&&(n%5==0)){
			System.out.println("FizzBuzz");
			System.out.println("Number "+n+" is divisible by 3 and 5");
		}
		else if(n%3==0){
			System.out.println("Fizz");
			System.out.println("Number "+n+" is divisible by 3");
		}
		else if(n%5==0){
			System.out.println("Buzz");
			System.out.println("Number "+n+" is divisible by 5");
		}
		else{
			System.out.println("Number entered is "+n);
		}
		scanner.close();
		
	 }
	}


