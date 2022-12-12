package day1_basic_programs;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year in the format of yyyy");
        int year = scanner.nextInt();

        findLeapYear(year);
    }

    private static void findLeapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " " + "Leap year ");

        } else {
            System.out.println(year + " " +"Not Leap Year");
        }
    }
}
