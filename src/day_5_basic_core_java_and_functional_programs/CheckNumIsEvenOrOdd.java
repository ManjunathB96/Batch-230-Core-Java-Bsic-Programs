package day_5_basic_core_java_and_functional_programs;

import java.util.Scanner;
import java.util.function.Predicate;

public class CheckNumIsEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int n = sc.nextInt();

        evenOrOddNum(n);
    }

    static void evenOrOddNum(int n) {
        Predicate<Integer> p = num -> num % 2 == 0;

        if (p.test(n) == true) {
            System.out.println(n + " " + "Even Number");
        } else if(p.test(n) == false) {
            System.out.println(n + " " + "Odd Number");
        }
    }
}
