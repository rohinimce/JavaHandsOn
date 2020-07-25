package stringExercise;

public class ReverseString {
	
	public static void main(String[] args) {
		
	ReverseString rev=new ReverseString();
	/*rev.reverseIntergerNumberAsString(1234);
		
		 * System.out.println("---------------"); rev.numberPalindromOrNot(12321);
		 * System.out.println("---------------"); rev.numberPalindromOrNot(123210);
		 * System.out.println("---------------");
		 */
//rev.reverseStringForLoop("Hello");

	}
	public void reverseIntergerNumberAsString(int number) {
	
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
		
	
		
		
}
