package day_5_basic_core_java_and_functional_programs;

import java.util.Scanner;

interface LeapYear {
    void leapYear(int year);

}

class LeapYearImpl implements LeapYear {
    @Override
    public void leapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " " + "Leap year ");

        } else {
            System.out.println(year + " " + "Not Leap Year");
        }
    }

    public static void main(String[] args) {
        LeapYearImpl yearRef = new LeapYearImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year in the format of yyyy");
        int year = scanner.nextInt();

        yearRef.leapYear(year);
    }
}
