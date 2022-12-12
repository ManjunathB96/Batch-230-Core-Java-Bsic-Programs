package day2_conditional_statement_programs;

public class ReverseIntNumUsingForLoop {
    public static void main(String[] args) {
        int num = 231;
        reverseIntNumber(num);
    }

    private static void reverseIntNumber(int num) {
        int reverse = 0;
        int a;
        for (  ;num != 0; ) {
            a = num % 10;
            reverse = (reverse * 10) + a;
            num = num / 10;
        }
        System.out.println(reverse);
    }
}
