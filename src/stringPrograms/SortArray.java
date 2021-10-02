package stringPrograms;

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


	public static void sortCharArray() {
		char[] a = {'s', 'g', 't', 'r', 'a'};
		char temp = 0;
		int size = a.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}

		for (char j : a)
			System.out.println(j);
	}

	public static void sortStringArray() {
		//Lexicographical order
		String[] str = {"bat", "dog", "apple", "cat"};
		int size = str.length;
		String temp = "";
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;

				}
			}
		}
		for(String s:str)
			System.out.println(s);
	}
}
