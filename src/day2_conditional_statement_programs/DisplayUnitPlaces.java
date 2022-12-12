package day2_conditional_statement_programs;

import java.util.Scanner;

public class DisplayUnitPlaces {
    public static void main(String[] args) {
        int unitPos,tenPos,hundredPos;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three digit number..!");
        int num = scanner.nextInt();

        unitPos = num%10;
        tenPos = num%100/10;
        hundredPos = num%1000/100;

        System.out.println("The Number in The unit place is :"+unitPos);
        System.out.println("The Number in The ten place is :"+tenPos);
        System.out.println("The Number in The hundred place is :"+hundredPos);

    }
}
