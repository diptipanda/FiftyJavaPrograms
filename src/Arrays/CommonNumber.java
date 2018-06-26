package Arrays;

public class CommonNumber {
	
	public static void main(String args[]){
		
		int [] array1 = {1,5,6,8,3,5};
		int [] array2 = {1,9,4,6,1,5};
		
		for (int i = 0;i < array1.length; i++)
		{
			
			for (int j = 0; j< array2.length; j++)
			{
				if(array1[i] == array2[j])
				{
					System.out.println (array1[i]);
				}
				
			}
		}
	}

}
