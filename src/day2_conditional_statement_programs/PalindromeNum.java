package day2_conditional_statement_programs;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        num = scanner.nextInt();
        palindromeNumber(num);

    }
    public static void palindromeNumber(int num){
        int  revNum, originalNum, rem;
        originalNum = num;
        revNum = 0;
        while (num > 0) {
            rem = num % 10;
            revNum = (revNum * 10) + rem;
            num = num / 10;
        }
        if (originalNum == revNum) {
            System.out.println(originalNum + " " + "Is a Palindrome number");
        } else {
            System.out.println(originalNum + " " + "Not a palindrome number");
        }
    }
}
