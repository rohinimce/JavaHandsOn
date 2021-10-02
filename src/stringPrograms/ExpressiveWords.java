package stringPrograms;

public class ExpressiveWords {
    public static void main(String[] args){
       // expressiveWords("heeo", new String[]{"hi", "hello","helo"});
        System.out.println(  expressiveWords("helllooooooo", new String[]{"hi", "hello"}));
    }

    public static int expressiveWords(String S, String[] words) {
        int count = 0;
        char[] sChar = S.toCharArray();
        for (String word : words) {
            char[] wChar = word.toCharArray();
            if (check(sChar, wChar)) {
                count++;
            }
        }

        return count;
    }

    private static boolean check(char[] s, char[] w) {
        int i = 0;
        int j = 0;

        while (i < s.length && j < w.length) {
            if (s[i] != w[j]) {
                return false;
            }

            int tempI = i;
            int tempJ = j;

            while (i < s.length && s[i] == s[tempI]) {
                i++;
            }

            while (j < w.length && w[j] == w[tempJ]) {
                j++;
            }

            int l1 = i - tempI;
            int l2 = j - tempJ;

            if (l1 == l2 || l1 >= 3 && l1 > l2) {
                continue;
            }

            return false;
        }

        return i == s.length && j == w.length;
    }

}
