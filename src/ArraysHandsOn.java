import java.util.Arrays;
import java.util.HashSet;

public class ArraysHandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicates();
	}
	
	public static void sortLowToHigh() {
		int[] a= {3,5,2,6,1,8,4};
		int size=a.length;
		int temp=0;
		
		System.out.println(Arrays.toString(a));
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));	
	}
	
	public  static void duplicates() {
		Integer[] a= {3,5,2,6,6,1,8,4,4};
		for(int q:a) {
			System.out.print(q+",");
		}
		System.out.println();
		HashSet<Integer> set= new HashSet<Integer>();
		
		for(int e: a) {
			if(!set.add(e)) {
				System.out.println("Duplicate Element"+e);
			}
		}
		
	}

}
