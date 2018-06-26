package Arrays;

public class MissingNumber {

	public static void main(String args[]){
		
		int[] array = {1,2,3,4,5,6,8,9};
		
		int n = array.length+1;
		 
		int sum = n*(n+1)/2;
		
		int arraySum = 0;
		
		for(int i=0;i<array.length;i++)
		{
			arraySum = arraySum +array[i];
		}
		int missingNum = sum - arraySum;
		System.out.println("missing number from given array is: "+ missingNum);
		
	}
}