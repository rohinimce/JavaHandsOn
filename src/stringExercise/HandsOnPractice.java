package stringExercise;

import java.util.*;
import java.util.Arrays;
import java.util.function.Predicate;

public class HandsOnPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,0,4,9,7,8};
		int temp;
		int size=arr.length;
		for(int r:arr) {
			System.out.print(r+" ");
		}
		for(int i=0;i<=size-1;i++) {
			for(int j=i+1;j<=size-1;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
									
				}
			}
			
		}
		System.out.println();
		for(int r:arr) {
			System.out.print(r+" ");
		}
	
	}
}