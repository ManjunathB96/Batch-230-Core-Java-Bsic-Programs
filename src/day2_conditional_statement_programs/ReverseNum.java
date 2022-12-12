package day2_conditional_statement_programs;

public class ReverseNum {
    public static void main(String[] args) {
        ReverseNum numRef = new ReverseNum();
        int num = 231;
        numRef.reverseIntNum(num);
    }

    public void reverseIntNum(int num) {
        int reverse = 0;
        int a;
        while (num != 0) {
            a = num % 10;
            reverse = (reverse * 10) + a;
            num = num / 10;
        }
        System.out.println(reverse);
    }
}
