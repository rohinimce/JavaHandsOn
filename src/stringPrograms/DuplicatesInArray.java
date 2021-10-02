package stringPrograms;

import java.util.HashSet;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDuplicatesUsingHashSet();
	}

	
	private static void findDuplicatesUsingHashSet(){
		int[] inputArray	= {1,2,3,1,4,5,6,7,7};

	    HashSet<Integer> set = new HashSet<Integer>();
	         
	    for (int element : inputArray) 
	    {
	        if( ! set.add(element))
	        {
	            System.out.println("Duplicate Element : "+element);
	        }
	    }
}
}