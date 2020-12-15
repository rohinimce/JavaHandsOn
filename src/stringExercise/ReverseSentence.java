package stringExercise;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="the java program";
		String[] s=sentence.split(" ");
		String output="";
		int noOfWords=s.length;
		for(int i=noOfWords-1;i>=0;i--) {
			output+=s[i]+" ";
		}
		
		System.out.println(output.substring(0,output.length()-1));

	}

}
