package stringPrograms;

public class CaptializeFirstCharacter {

	public static void main(String[] args) {
		

		String s1="jaVa pROgram";
		String str=s1.toLowerCase();
		
		  StringBuffer s = new StringBuffer();
		  
	        // Declare a character of space
	        // To identify that the next character is the starting
	        // of a new word
	        char ch = ' ';
	        for (int i = 0; i < str.length(); i++) {
	             
	            // If previous character is space and current
	            // character is not space then it shows that
	            // current letter is the starting of the word
	            if (ch == ' ' && str.charAt(i) != ' ')
	                s.append(Character.toUpperCase(str.charAt(i)));
	            else
	                s.append(str.charAt(i));
	            ch = str.charAt(i);
	        }
	 
	        // Return the string with trimming
	     System.out.println( s.toString().trim());  
		
	}
}
