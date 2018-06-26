package Collection;

import java.util.ArrayList;

public class ArraylistToArray {

	public static void main (String args[]){
		
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		list1.add("Five");
		
		String[] array1 = new String[list1.size()];
		
		list1.toArray(array1);
		
		System.out.println("Created Array content:");
        for(String s:array1){
            System.out.println(s);
	}
	}
	}
