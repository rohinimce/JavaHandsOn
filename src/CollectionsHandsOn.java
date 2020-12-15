import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.function.Predicate;

public class CollectionsHandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrayToArrayList();
		iterateHashMap();
	}

	
	public static void arrayToArrayList() {
		Integer[] a= {1,2,3,4,6};
		ArrayList< Integer> alist= new ArrayList<Integer>(Arrays.asList(a));
		/*
		 * System.out.println(alist);
		 * 
		 * Object[] b; b= alist.toArray(); for(Object i:b) { System.out.println(i); }
		 */
	alist.add(7);
	alist.add(0);
	alist.add(8);
	alist.add(9);
	alist.add(0);
	
	 System.out.println(alist);
	 
	 Predicate<Integer> p= item->(item==0);
	 
	 
	 ArrayList<Integer> blist=new ArrayList<Integer>();
	 
	 for(int i: alist) {
		 if(p.test(i)) {
			 blist.add(i);
	
			 
		 }
	 }
	 
	 System.out.println(blist);
	 alist.removeAll(blist);
	 System.out.println(alist);
	 
		}
	
	public static void iterateHashMap() {
		HashMap<Integer, String> map=new HashMap();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(5, "Five");
		map.put(3, "Three");
		map.put(4, "Four");
		
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+ "- "+ entry.getValue());
		}
		
		System.out.println("--------");
		
		for(Integer i:map.keySet()) {
			System.out.println(i);
		}
		
		for(String k:map.values()) {
			System.out.println(k);
		}
	}
}
