package collectionFrameworkDemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	Set<Integer> set;
	Iterator itr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetDemo demo=new SetDemo();
		System.out.println("Hash Set");
		demo.hashSetMethod();
		System.out.println("LInkedHash Set");
		demo.linkedHashSet();
		System.out.println("Tree Set");
		demo.treeSet();
		System.out.println();
	System.out.println("------------------->");
	demo.unionIntersectionDifferenceSet();
	}

	
	public void hashSetMethod() {
		set=new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		
		itr=set.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
		}
		System.out.println();
	}
	
	public void linkedHashSet() {
		set=new LinkedHashSet<Integer>();
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(10);
		itr=set.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
		}
		
		System.out.println();
		
	}
	
	public void treeSet() {
		set=new TreeSet<Integer>();
		
		TreeSet set1=new TreeSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		
itr=set.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
		}
	}
	
	public void unionIntersectionDifferenceSet() {
		Set<Integer> a = new HashSet<Integer>();  
        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));  
        Set<Integer> b = new HashSet<Integer>();  
        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));  
  
        // To find union  
        Set<Integer> union = new HashSet<Integer>(a);  
        union.addAll(b);  
        System.out.print("Union of the two Set");  
        System.out.println(union);  
  
        // To find intersection  
        Set<Integer> intersection = new HashSet<Integer>(a);  
        intersection.retainAll(b);  
        System.out.print("Intersection of the two Set");  
        System.out.println(intersection);  
  
        // To find the symmetric difference  
        Set<Integer> difference = new HashSet<Integer>(a);  
        difference.removeAll(b);  
        System.out.print("Difference of the two Set");  
        System.out.println(difference); 	
	}
}
