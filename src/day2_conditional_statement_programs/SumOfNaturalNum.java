package day2_conditional_statement_programs;

import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args) {
        SumOfNaturalNum naturalNum = new SumOfNaturalNum();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of terms :");
        int num = scanner.nextInt();
        naturalNum.sumOfNaturalNum(num);

    }
    public void sumOfNaturalNum(int num) {
        int sum = 0;
        int i =0;
        while (i<=num){
            sum = sum + i;
            i++;
        }

        System.out.println("Sum of given  natural number is :->"+" "+sum);
    }
}
