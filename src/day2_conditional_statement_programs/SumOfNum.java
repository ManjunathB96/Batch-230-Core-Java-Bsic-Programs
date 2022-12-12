package day2_conditional_statement_programs;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of terms :");
        int num = scanner.nextInt();
        sumOfNaturalNum(num);

    }
    public static void sumOfNaturalNum(int num){
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }

        System.out.println("Sum of n natural number is :->"+" "+sum);

    }
}
