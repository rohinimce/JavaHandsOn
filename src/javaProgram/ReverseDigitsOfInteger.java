package javaProgram;

public class ReverseDigitsOfInteger {
    public static void main(String args[]) {
        int num = 3689;
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse of no. is " + rev_num);
    }
}
