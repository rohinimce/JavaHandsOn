package arrayPrograms;

public class swapArrayDiffSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapArrayDiffSize swap = new swapArrayDiffSize();
		//swap.swapTwoArrayWithDiffSize();
		swap.swapTwoArray();
	}

	public void swapTwoArrayWithDiffSize() {
		int a[] = { 0, 1, 2, 3, 4 };
		int b[] = new int[5];
		b[0] = 5;
		b[1] = 6;
		b[2] = 7;
		b[3] = 8;
System.out.println("Array a "+a.toString());
System.out.println("Array b "+b.toString());
		int aSize = a.length;
		int bSize = b.length;
		int k = 0;
		int l = 0;

		for (int i = bSize - 1; i >= 0; i--) { //iterating b array from last

			for (int j = 0; j < aSize; j++) { //iterating a array from first
				b[i] = a[k];  //adding array a first element to array b last element
				k++;
				System.out.println("b[" + i + "]--->" + b[i]);
				break;

			}

			if (i == 0) {
				a[aSize - 1] = 0;
				break;
			} else {

				a[l] = b[i - 1];
				System.out.println("a[" + l + "]--->" + a[l]);
				l++;
			}

		}

		System.out.println("Array a");

		for (int c : a) {
			System.out.print(c);

		}
		System.out.println("Array b");
		for (int d : b) {

			System.out.print(d);

		}
		
		System.out.println("Array a after swaping "+a.toString());
		System.out.println("Array b after swaping"+b.toString());
	}
	
	
	public void swapTwoArray() {
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {6,7,8,9,10};
		int[] temp=new int[5];
		
		for(int j:arr1) {
			System.out.print(j+" ");
		}
		System.out.println();
		for(int j:arr2) {
			System.out.print(j+" ");
		}
		System.out.println();
		for(int i=0;i<4;i++) {
			
			temp[i]=arr1[i];
			arr1[i]=arr2[i];
			arr2[i]=temp[i];
			
			
		}
		
		for(int t:arr1) {
			System.out.print(t+" ");
		}
		System.out.println();
		for(int y:arr2) {
			System.out.print(y+" ");
		}
	}
}
