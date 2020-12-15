package stringPrograms;

public class CaptializeFirstCharacter {

	public static void main(String[] args) {
		

		//CaptializeFirstCharacter.usingInbuildFunction();
		// TODO Auto-generated method stub
		String str="rrtr EEE";
		int nums[]={1,2,3,4,5};
		int[] a;
		a = new int[2];
		 if (nums.length %2 == 0) {
        a[0] = nums[(nums.length/2) - 1];
        a[1] = nums[nums.length/2];
		 }else{
			 a = new int[1];
		        a[0] = nums[nums.length/2];
		 }
		 // Create a char array of given String
      /*  char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
 
            // If first character of a word is found
            if (i == 0 && ch[i] != ' ' || 
                ch[i] != ' ' && ch[i - 1] == ' ') {
 
                // If it is in lower-case
                if (ch[i] >= 'a' && ch[i] <= 'z') {
 
                    // Convert into Upper-case
                    ch[i] = (char)(ch[i] - 'a' + 'A');
                }
            }
 
            // If apart from first character
            // Any one is in Upper-cases
            else if (ch[i] >= 'A' && ch[i] <= 'Z') 
 
                // Convert into Lower-Case
                ch[i] = (char)(ch[i] + 'a' - 'A');  */          
     //   }
     // Convert the char array to equivalent String
       /* String st = new String(ch);
        System.out.println(st);*/
        
        
	}

	public static void usingInbuildFunction(){
		String s1="geeKSS";
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
