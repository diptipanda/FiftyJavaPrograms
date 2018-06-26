package Arrays;


	import java.util.Scanner;

	public class SortedArraySwap {
		
		public static void main(String args[]){
			
			SortedArraySwap sr=new SortedArraySwap();
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the size of array");
			
			int m= sc.nextInt();
			
			int[] arr=new int[m];
			
			System.out.println("enter the array");
			
			for(int i=0;i<m;i++)
			{
			arr[i]=sc.nextInt();
			}
			sr.sortArray(m,arr);
			
			sc.close();	
		}


		void sortArray(int m,int[] arr){
			
		    for (int i = m-1; i > 0; i--)
		    {
		        
		        if (arr[i] < arr[i-1])
		        {
		           
		           int j = i-1;
		            while (j>=0 && arr[i] < arr[j])
		                j--;
		 
		           
		            int temp;
		            
		           temp=arr[i];
		           
		           arr[i]=arr[j+1];
		           
		           arr[j+1]=temp;
		           
		            break;
		        }
		    }
		System.out.println("the sorted array");
		
		for(int i=0;i<m;i++){
			
			System.out.print(arr[i]+" ");
		}
		}

	}