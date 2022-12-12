package day2_conditional_statement_programs;

import java.util.Scanner;

public class CheckVowelOrCons {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  Character");
        char ch = scanner.next().charAt(0);
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                i++;
        }
        if (i==1){
            System.out.println("Entered character"+"-> "+ch+"-> "+"is Vowel");
        }
        else {
            if( (ch >='a' && ch<='z') || (ch >='A' && ch<='Z')){
                System.out.println("Entered character "+" ->"+ch+"->"+"is Consonant");

            }else {
                System.out.println("Not an Alphabet");
            }
        }
    }
}
