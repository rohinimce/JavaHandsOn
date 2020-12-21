package stringPrograms;

public class PermutationsOfString {
    // Function to print all the permutations of given string
    static void permutation(String s, String result)
    {
        // If string is empty
        if (s.length() == 0) {
            System.out.print(result + " ");
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            // ith character of string
            char ch = s.charAt(i);
            // Remaining string after excluding the ith character
            String remainStr = s.substring(0, i) + s.substring(i + 1);
            // Recursive call
            permutation(remainStr, result + ch);
        }
    }
    public static void main(String[] args)
    {
        String d = "Dev";
        permutation(d, "");

    }

}
