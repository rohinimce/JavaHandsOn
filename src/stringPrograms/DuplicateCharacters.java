package stringPrograms;

public class DuplicateCharacters {
//Number of occurances of each character in a string
	public static void main(String[] args) {

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
