package day2_conditional_statement_programs;

import java.util.Scanner;

public class ConvertDigitToWord {
    public static void main(String[] args) {
        ConvertDigitToWord d = new ConvertDigitToWord();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();


        String str = d.convert(num);
        System.out.println(str);

    }

    public String oneToTen(int num) {
        String str = "";
        while (num != 0) {
            if (num == 1) {
                str = str + "One";
                num = 0;
            } else if (num == 2) {
                str = str + "Two";
                num = 0;
            } else if (num == 3) {
                str = str + "Three";
                num = 0;
            } else if (num == 4) {
                str = str + "Four";
                num = 0;
            } else if (num == 5) {
                str = str + "Five";
                num = 0;
            } else if (num == 6) {
                str = str + "Six";
                num = 0;
            } else if (num == 7) {
                str = str + "Seven";
                num = 0;
            } else if (num == 8) {
                str = str + "Eight";
                num = 0;

            } else if (num == 9) {
                str = str + "Nine";
                num = 0;
            } else if (num == 10) {
                str = str + "Ten";
                num = 0;
            }
        }
        return str;
    }

    public String convert(int n) {
        String str = "";
        while (n != 0) {
            if (n >= 1 && n <= 10) {
                str = str + oneToTen(n);
                n = 0;
            }
        }
        return str;
    }
}
