package arrayPrograms;

public class TryHandsOn {
    public static void main(String args[]) {
      //  sortStringArray();

        String str = "Learn, Lead and Succeed in DevLabsAlliance";

      String strR=  str.replaceAll("in","with");
        System.out.println(strR);
    }

    public static void sortIntArray() {
        int[] a = {1, 3, 5, 7, 2, 9, 8};
        for (int k : a) {
            System.out.print(k);
        }
        int temp = 0;
        int size = a.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int k : a) {
            System.out.println(k);
        }
    }

}