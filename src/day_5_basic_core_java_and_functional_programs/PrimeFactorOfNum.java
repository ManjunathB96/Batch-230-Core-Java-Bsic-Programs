package day_5_basic_core_java_and_functional_programs;

import java.util.Scanner;

public class PrimeFactorOfNum {
    int num;

    public PrimeFactorOfNum(int num) {
        this.num = num;
    }

    void primeFactor() {
        while (num % 2 == 0) {
            System.out.println(2 + " ");
            num /= 2;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                System.out.println(i + " ");
                num /= i;
            }
        }
        if (num > 2)
            System.out.println("Prime Factors of a given number is :");
            System.out.print(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int num = sc.nextInt();
        PrimeFactorOfNum factor = new PrimeFactorOfNum(num);
        factor.primeFactor();
    }
}
