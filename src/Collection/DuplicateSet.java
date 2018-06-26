package Collection;

import java.util.HashSet;
import java.util.Set;

public class DuplicateSet {
	
	public static void main(String args[]){
		int [] array = {1,2,6,4,88,44,2,5,44};
		
		Set<Integer> set = new HashSet<Integer>();
		
		for( int i = 0; i < array.length ; i++){
			
			if(set.add(array[i]) == false)
				
					{
				
				System.out.println("Duplicate elements found :" + array[i]);
				
					}
		}
	}
	

}
