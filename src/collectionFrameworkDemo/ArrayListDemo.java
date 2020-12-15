package collectionFrameworkDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	
	List l1=new ArrayList();
	List l2=new ArrayList();
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayListDemo array=new ArrayListDemo();
		array.addElementsToArray();
		array.addElementInAPosition();
		array.getElementValue();
		array.removeElement();
		array.containsElement();
		array.addAllElements();
		array.listIterator();
		
		
		
	
	}

	public void addElementsToArray() {
		l1.add("apple");
		l1.add("red");
		l1.add("green");
		l1.add("yellow");
		System.out.println("List elements of l1 "+l1);
		
	}
	
	public void addElementInAPosition() {
		l1.add(2,7);
		System.out.println("Newly added List elements of l1 "+l1);
	}
	
	
	public void getElementValue() {
		String indexValue=(String) l1.get(0);
		System.out.println("Index value of 0 "+indexValue);
	}
	
	public void removeElement() {
		String removeElement=(String)l1.remove(1);
		System.out.println("Removed Element:"+removeElement);
	}
	
	public void containsElement() {
		System.out.println("List contains value apple:"+l1.contains("apple"));
		System.out.println("List contains value apple:"+l1.contains("red"));
	}
	
	public void addAllElements() {
		l2.add(1);
		l2.add(2);
		l1.addAll(l2);
		System.out.println("Add l2 in l1: "+l1);
		
		l1.add(1, l2);
		System.out.println("Add l2 in l1: "+l1);
	}
	
	public void listIterator() {
		ListIterator itr=l1.listIterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
		
	System.out.println("----------------");	
		while(itr.hasPrevious()) {
			System.out.print(itr.previous());
		}
	}
}
