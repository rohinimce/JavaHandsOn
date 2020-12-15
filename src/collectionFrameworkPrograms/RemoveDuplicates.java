package collectionFrameworkPrograms;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicates r = new RemoveDuplicates();
		r.removeUsingLinkedHashSet();
	}

	public void removeUsingLinkedHashSet() {

		List list = new ArrayList();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(3);

		System.out.println("list with duplicates:" + list);

		Set set = new LinkedHashSet();
		set.addAll(list);

		System.out.println("List to linkedHashSet" + set);
		list.clear();

		System.out.println("Print clear list" + list);
		list.addAll(set);
		System.out.println("List without duplicates:" + list);
		
		Collections.reverse(list);

		System.out.println("Reversed list:"+list);
		
		list.add(6);
		list.add(4);
		Comparator cmp = Collections.reverseOrder();  
		
	
	    Collections.sort(list,cmp); 
	    
	    System.out.println("Descending Order:"+list);
	    
	    Collections.sort(list);
	    System.out.println("Sorting: "+list);
	    
	
	    
	    
	}
}
