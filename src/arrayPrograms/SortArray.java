package arrayPrograms;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortArray sort=new SortArray();
		sort.sortArrayLowToHigh();
		sort.sortArrayHighToLow();

	}

	
	public void sortArrayLowToHigh() {
		int[] arr= {7,5,9,2,6,1,4};
		int temp=0;
		int arrLength=arr.length;
		System.out.println("Before Sorting");
		for(int t:arr) {
			System.out.print(t+" ");
		}
		
		for(int i=0;i<arrLength;i++) {
			for(int j=i+1;j<arrLength;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println();
		System.out.println("After Sorting");
		for(int t:arr) {
			System.out.print(t+" ");
		}
	}
	
	public void sortArrayHighToLow() {
		int[] arr= {7,5,9,2,6,1,4};
		int temp=0;
		int arrLength=arr.length;
		System.out.println("Before Sorting");
		for(int t:arr) {
			System.out.print(t+" ");
		}
		
		for(int i=0;i<arrLength;i++) {
			for(int j=i+1;j<arrLength;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println();
		System.out.println("After Sorting");
		for(int t:arr) {
			System.out.print(t+" ");
		}
	}
}
