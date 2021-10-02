package stringPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	iterativeMethod();
		retainAllMethod();
	}
	
	public static void  iterativeMethod() {
		
		 String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		 String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
		 HashSet<String> set = new HashSet<String>();
	 
	        for (int i = 0; i < s1.length; i++)
	        {
	            for (int j = 0; j < s2.length; j++)
	            {
	                if(s1[i].equals(s2[j]))
	                {
	                    set.add(s1[i]);
	                }
	            }
	        }
	 
	        System.out.println(set);    
		
	}

	public static void retainAllMethod() {
		Integer[] i1 = {1, 2, 3, 4, 5, 4};
		 
        Integer[] i2 = {3, 4, 5, 6, 7, 4};
 
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(i1));
        System.out.println(set1);
 
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(i2));
 
        set1.retainAll(set2);
 
        System.out.println(set1); 
	}
}
