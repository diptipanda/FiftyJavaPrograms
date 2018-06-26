package General;

public class NumberwithoutLoop {

	
		public static void main(String[] args) {
			
			printNumbers(10);
		}

		public static void printNumbers(int n) {

			if (n > 0) 
			{
				
				printNumbers(n - 1);
				
				System.out.println(n);
			}
		}
	}