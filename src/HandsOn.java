
public class HandsOn {
	String sentence="java program";
	char[] s=sentence.toCharArray();
	int size=s.length;
	public static void main(String[] args) {
		HandsOn obj= new HandsOn();
	
		obj.stringBufferReverse();
	
	
		}
	
	public void stringBufferReverse() {
		StringBuffer sb= new StringBuffer("abc");
		System.out.println(sb.reverse());
	System.out.println(	sb.append("afdfsfsfg"));
	sb.trimToSize();
		
		
	}
	public void reverseString() {
		String str="Java Program";
		char[] s=str.toCharArray();
		int size=s.length;
		for(int i=size-1;i>=0;i--) {
			System.out.print(s[i]);
		}
	}
	
	
	public void duplicate() {
		String str="Java Program";
		char[] s=str.toCharArray();
		int size=s.length;
		int count;
		for(int i=0;i<=size-1;i++) {
			count=1;
			for(int j=i+1;j<=size-1;j++) {
				if(s[i]==s[j]&& s[i]!=' ') {
					count++;
					s[j]='0';
				}
			}
			
			if(s[i]!='0') {
				System.out.println(s[i]+"-"+count);
			}
		}
	}
	
	public void reverseSentence() {
		String str="Java Program";
		String[] s=str.split(" ");
		String output="";
		int size=s.length;
		for(int i=size-1;i>=0;i--) {
			output+=s[i]+" ";
			
		}
	System.out.println(output.substring(0,output.length()-1));}
	
	public void reverseArray() {
		
		int[] a= {1,2,3,4,5};
		
	int start=0;
	int end=a.length-1;
	int temp;
	
	while(start<end) {
		
		temp=a[start];
		a[start]=a[end];
		a[end]=temp;
		start++;
		end--;
	}
	
	for(int i:a) {
		System.out.print(i);
	}
		}
	
public void sortArray() {
		
		int[] a= {1,2,0,3,-8,4,5};
		

	int temp;
	for(int i=0;i<=a.length-1;i++) {
		for(int j=i+1;j<=a.length-1;j++) {
			if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
System.out.println("after for");
	
	for(int i:a) {
		System.out.print(i);
	}
		}



	
}


