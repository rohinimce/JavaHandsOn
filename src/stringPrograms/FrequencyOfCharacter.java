package stringPrograms;

public class FrequencyOfCharacter {

    //Display number of occurences of a character in a string
    public static void main(String[] args) {
        String str = "DevLabs Alliance is awesome.";
        char ch = 'e';
        int frequency = 0;
        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }
        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}
