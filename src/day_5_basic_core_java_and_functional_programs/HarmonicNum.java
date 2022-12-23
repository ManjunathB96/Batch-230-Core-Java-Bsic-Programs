package day_5_basic_core_java_and_functional_programs;

import java.util.Scanner;

public class HarmonicNum {
    void display() {
        System.out.println("Welcome to Harmonic Number Program");
    }

    void harmonicNum(int num) {
        this.display();             //this keyword is used to invoke current class method
        double result = 0.0;
        while (num > 0) {
            result = result + (double) 1 / num;
            num--;
            System.out.println(result + " ");
        }
        System.out.println();
        System.out.println("Harmonic Series of a Number is :" + result);
    }

    public static void main(String[] args) {
        HarmonicNum obj = new HarmonicNum();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = scanner.nextInt();

        obj.harmonicNum(num);

    }
}
