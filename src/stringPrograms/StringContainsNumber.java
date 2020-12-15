package stringPrograms;

public class StringContainsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String s="test";
			
			boolean alphabets;
			if((s != null) && (!s.equals(""))  && (s.chars().allMatch(Character::isLetter))){
				alphabets =true;
			}else {
				alphabets=false;
			}
			System.out.println(s +"contains only alphabets"+alphabets);
		}
	}


