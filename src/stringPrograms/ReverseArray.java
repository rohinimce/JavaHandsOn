package stringPrograms;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseArray sort=new ReverseArray();
		sort.reverseArray();
		
	}
	
	public void reverseArray() {		
		
		int arr[] = {1, 2, 3, 4, 5, 6};
		System.out.println("Before Reverse ");
		 for(int t:arr) {
				
	        	System.out.print(t+" ");
	        }
		int start=0;
		int end=arr.length-1;
		int temp;
          
	        while (start < end)
	        {
	            temp = arr[start]; 
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        } 
	        System.out.println();
	        System.out.println("After Reverse ");
	        for(int t:arr) {
	        	System.out.print(t+" ");
	        }
	}
	

}
