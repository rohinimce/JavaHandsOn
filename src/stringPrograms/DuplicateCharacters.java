package stringPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateCharacters {
//Number of occurances of each character in a string
	public static void main(String[] args) {

		//findDuplicates();
		immediateRepeativeChar();
	}

	public static void findDuplicates() {
		String str = "java program";
		char[] s = str.toCharArray();
		int count;
		for (int i = 0; i < s.length; i++) {
			count = 1;
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] == s[j] && s[i] != ' ') {
					count++;
					s[j] = '0'; //
				}
			}
			if(s[i]!='0') {
				  System.out.println(s[i]+"-"+count); }
			 
		}
	}

	public static void  immediateRepeativeChar(){

		String stringToMatch = "abccdefjavaprogram";
		Pattern p = Pattern.compile("(\\w)\\1+");
		Matcher m = p.matcher(stringToMatch);
		if (m.find())
		{
			System.out.println("Duplicate character " + m.group(1));
		}
	}

}
