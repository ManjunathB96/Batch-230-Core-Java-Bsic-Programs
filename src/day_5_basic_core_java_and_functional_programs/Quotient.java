package day_5_basic_core_java_and_functional_programs;

import java.util.Scanner;

public class Quotient {
    void quoAndRemCal(int dividend, int divisor){
        int quotient=dividend/divisor;
        System.out.println("Quotient is :"+quotient);
    }
}
class Reminder extends Quotient{
    void quoAndRemCal(int dividend, int divisor){
        super.quoAndRemCal(dividend, divisor);
        int reminder=dividend%divisor;
        System.out.println("Reminder is :"+reminder);
    }
}
class MainImpl{
    public static void main(String[] args) {
        Reminder rem=new Reminder();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a dividend");
        int dividend=scanner.nextInt();

        System.out.println("Enter a divisor");
        int divisor=scanner.nextInt();

        rem.quoAndRemCal(dividend,divisor);
    }
}

