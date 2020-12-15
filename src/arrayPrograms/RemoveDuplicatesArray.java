package arrayPrograms;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d=4435.5547878787879898980809567567867887878787879787878;
		System.out.println(d);
		float f=(float)d;
		System.out.println(f);
		long l= (long) d;
		System.out.println(l);
		int i=(int)l;
		System.out.println(i);
		//removeDuplictesInArray();

	}
public static void removeDuplictesInArray(){
	 int arr[] = {10,20,20,30,30,40,50,50};  
     int n = arr.length;
      
     int[] temp = new int[n];  
     int j = 0;  
     for (int i=0; i<n-1; i++){  
         if (arr[i] != arr[i+1]){  
     
         temp[j++] = arr[i];  
         }  
      }  
     //System.out.println(j++);
     temp[j++] = arr[n-1];  
     System.out.println(""+temp[j++]);
     // Changing original array  
     for (int i=0; i<j; i++){  
         arr[i] = temp[i];  
     }  
     
     n=j;
     for (int i=0; i<n; i++)  
         System.out.print(arr[i]+" ");  
  }  
}

