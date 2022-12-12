package day2_conditional_statement_programs;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Three Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int cal;

        cal = a + b * c;
        System.out.println("Arithmetic Operation 1) :" + cal);

        cal = c + a / b;
        System.out.println("Arithmetic Operation 2) :" + cal);

        cal = a % b + c;
        System.out.println("Arithmetic Operation 3) :" + cal);

        cal = a * b + c;
        System.out.println("Arithmetic Operation 4) :" + cal);

    }
}
