package collectionFrameworkPrograms;

import java.util.*;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public void reverseArrayList() {
		Integer[] arr= {1,2,3,4,5};
		List <Integer> list= new ArrayList(Arrays.asList(arr));
		List<Integer> revList=new ArrayList<Integer>();
		int size=list.size();
		for(int i=size-1;i>=0;i--) {
			
			revList.add(list.get(i));
		}

		System.out.println(revList);
		
	}
}
