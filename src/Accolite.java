public class Accolite {


    public static void main(String[] args) {
        String str = "AABBytyQQ";
        char[] c = str.toCharArray();
        int size = c.length;
        int count;
        for (int i = 0; i < size; i++) {
            count = 1;
            for (int j = i + 1; j < size; j++) {

                if (c[i] == c[j] && c[i] != '0') {

                    count++;
                    c[j] = '0';
                }
            }
            if(c[i]!='0' ){
                System.out.println(c[i]+"-"+count);
            }
        }
    }
}