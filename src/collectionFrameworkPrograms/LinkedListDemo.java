package collectionFrameworkPrograms;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list=new LinkedList();
		
		List list1=new LinkedList();
		list.add(1);
		list.add(2);
		
		
		list.add(3);
		
		
		list.addFirst(0);
		System.out.println("first element:"+list);
		
		list.addLast(4);
		
		System.out.println("last element:"+list);
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		Integer firstnumber=(Integer)list.getFirst();
		System.out.println(firstnumber);
		Integer lastnumber=(Integer)list.getLast();
		System.out.println(lastnumber);
		
	}

}
