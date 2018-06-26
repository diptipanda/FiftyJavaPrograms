package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArraylistExample {
	
	public static void main(String args[]){
		
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		boolean isFound = list1.contains(10);
		if(isFound == false)
			System.out.println("Element is not found in the list");
		else
			System.out.println("Element is found in the list");

		ListIterator<Integer> itr = list1.listIterator(); 
		
		while (itr.hasNext()){
			
			System.out.println(itr.next());
			
		}
		
		System.out.println("traversing list elements in backward direction...");  
		
		while(itr.hasPrevious()){
			
		System.out.println(itr.previous());  

		}
	
	

	}
	}
