package stringPrograms;

public class ReverseString {
	
	public static void main(String[] args) {
		
	ReverseString rev=new ReverseString();
	/*rev.reverseIntergerNumberAsString(1234);
		
		 * System.out.println("---------------"); rev.numberPalindromOrNot(12321);
		 * System.out.println("---------------"); rev.numberPalindromOrNot(123210);
		 * System.out.println("---------------");
		 */
//rev.reverseStringForLoop("Hello");
	rev.stringReverse();

	}
	public void reverseIntergerNumberAsString() {
	int number=12343247;
		String strNumber=String.valueOf(number);
		StringBuilder sb=new StringBuilder(strNumber);
		System.out.println("Given Number: "+strNumber);
		System.out.println("Reversed Number: "+sb.reverse());
		
	}
	
	public void numberPalindromOrNot(int number) {
		String strNumber=String.valueOf(number);
		StringBuilder sb=new StringBuilder(strNumber);
		String reversedString=sb.reverse().toString();
		System.out.println("Given Number: "+strNumber);
		if(strNumber.equals(reversedString)) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("NUmber is not palindrome");
		}
		}
		
	//using while loop
	public void reverseStringWhileLoop(String strGivenString	) {
		System.out.println("Given String: "+strGivenString);
		int i=strGivenString.length();
		System.out.println("Reverse String: "+strGivenString);
		while(i>0)
		{
		System.out.print(strGivenString.charAt(i-1)); 
		i--;
		}	
				
	}

	
	//using for loop
		public void reverseStringForLoop(String strGivenString	) {
			System.out.println("Given String: "+strGivenString);
			int stringSize=strGivenString.length();
			System.out.println("Reverse String: ");
			for(int i=stringSize;i>0;i--) {
				System.out.print(strGivenString.charAt(i-1));
			}				
				
		}
		
		public void reverseSentence(String sentence) {
			String[] strGivenSentence=sentence.split(" ");
			String output="";
			int noOfWords=strGivenSentence.length;
			System.out.println(noOfWords);
			for (int i=noOfWords-1;i>=0;i--) {
				output+=strGivenSentence[i]+" ";
			}
			System.out.println("Reverse String:"+(output.substring(0, output.length()-1)));
			
			
		}
		
	
		public void stringReverse() {
String str="java program";
//int size=str.length();
//for(int i=size;i>0;i--) {
//	System.out.print(str.charAt(i-1));
//}
//	String[] s= str.split(" ");
//	String output="";
//	for(int i=s.length-1;i>=0;i--) {
//		output+=s[i]+" ";
//		
//	}
//System.out.println("Reverse sentence"+output.substring(0, output.length()-1));


char[] sChar=str.toCharArray();
int count;

for(int i=0;i<sChar.length;i++) {
	count=1;
	for(int j=i+1;j<sChar.length;j++) {
		if(sChar[i]==sChar[j]&&sChar[i]!=' ') {
			count++;
			sChar[j]='0';
			
		}
		
		}
	if(sChar[i]!='0') {
		System.out.println(sChar[i]+" -"+count);
		
	}
}
		}

	private static void isPalindromeString(String str) {

		int length = str.length();
		System.out.println(length/2);
		for (int i = 0; i < length / 2; i++) {
			if (str.charAt(i) != str.charAt(length - i - 1)){
				System.out.println("Not a palindrome");
			}
		}
	}
		
}