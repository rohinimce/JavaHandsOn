package stringPrograms;

public class DuplicateCharacters {

	public static void main(String[] args) {
//	        String string1 = "Great responsibility";  
//	        int count;  
//	          
//	        //Converts given string into character array  
//	        char string[] = string1.toCharArray();  
//	          
//	        System.out.println("Duplicate characters in a given string: ");  
//	        //Counts each character present in the string  
//	        for(int i = 0; i <string.length; i++) {  
//	            count = 1;  
//	            System.out.println("i loop - "+string[i]);
//	            for(int j = i+1; j <string.length; j++) {  
//	            	  System.out.println("j loop ---->"+string[j]);
//	                if(string[i] == string[j] && string[i] != ' ') {  
//	                    count++;  
//	                    //Set string[j] to 0 to avoid printing visited character  
//	                    string[j] = '0';  
//	                }  
//	            }  
//	            System.out.println(string[i]+"count is"+count);  
//	            //A character is considered as duplicate if count is greater than 1  
//	            if(count > 1 && string[i] != '0')  
//	                System.out.println(string[i]+"count is"+count);  
//	        }  
		DuplicateCharacters dup = new DuplicateCharacters();
		dup.findDuplicates();
	}

	public void findDuplicates() {
		String str = "java program";
		char[] s = str.toCharArray();
		int count;
		for (int i = 0; i < s.length; i++) {
			count = 1;
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] == s[j] && s[i] != ' ') {
					count++;
					s[j] = '0';
				}
			}

			
			  if(s[i]!='0') { 
				  System.out.println(s[i]+"-"+count); }
			 
		}
	}

}
