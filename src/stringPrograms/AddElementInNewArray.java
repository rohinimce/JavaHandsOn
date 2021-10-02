package stringPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AddElementInNewArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddElementInNewArray test=new AddElementInNewArray();
		test.addElementInNewArray(11);
	}
	
	/*
	 * Create a new array of size n+1, where n is the size of the original array.
	 * Add the n elements of the original array in this array. Add the new element
	 * in the n+1 th position. Print the new array.
	 */
	
	public void addElementInNewArray(int x) {		
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int arrSize=arr.length;
		int[] newArr= new int[arrSize+1];
		for(int i=0;i<arrSize;i++) {
		newArr[i]=arr[i];
		newArr[arrSize]=x;
		}
		
		System.out.println("Old Array"+Arrays.toString(arr));		
		System.out.println("New Array"+Arrays.toString(newArr));
		
		Integer[] arr1= {1,2,3,4,5,6,7,8,9,10};		
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(arr1));
		System.out.println("ArrayList before"+list);
		list.add(x);	
		System.out.println("ArrayList After"+list);
		
	}

}
