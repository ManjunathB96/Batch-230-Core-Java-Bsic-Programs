package day1_basic_programs;

import java.util.Scanner;

public class TwoStrEqualOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two String Value To Check Both are Equal or Not");
        System.out.println("Enter First String :");
        String str1 = scanner.nextLine();

        System.out.println("Enter Second String :");
        String str2 = scanner.nextLine();

        stringsEqualOrNot(str1,str2);

    }

    private static void stringsEqualOrNot(String str1, String str2) {
        if (str1.equals(str2)){
            System.out.println("Both Strings Are Equal ");
        }else {
            System.out.println("Not Equal");
        }
    }
}
