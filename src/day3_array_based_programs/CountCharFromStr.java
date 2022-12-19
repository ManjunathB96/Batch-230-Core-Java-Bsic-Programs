package day3_array_based_programs;

import java.util.Scanner;

public class CountCharFromStr {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CountCharFromStr obj = new CountCharFromStr();
        String[] str = {"manju", "kiran", "ashish", " raju"};
        System.out.println("Enter the character you want to count");
        char ch = sc.next().toLowerCase().charAt(0);
        int i = obj.countChars(str, ch);
        if (i == 0) {
            System.out.println("entered character is not found");
        } else {
            System.out.println("Count of  given character  is ->" + i);
        }
    }

    public int countChars(String[] str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            String m = str[i];
            for (int j = 0; j < m.length(); j++) {
                if (ch == m.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
}