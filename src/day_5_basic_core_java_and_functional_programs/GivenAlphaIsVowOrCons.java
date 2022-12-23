package day_5_basic_core_java_and_functional_programs;

import java.util.Scanner;
import java.util.function.Consumer;

public class GivenAlphaIsVowOrCons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabet");
        String str = sc.next().toLowerCase();
        char alpha = str.charAt(0);

        vowOrCons(alpha);
    }

    public static void vowOrCons(char alpha) {
        Consumer<Character> c = s ->
        {
            if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
                System.out.println("The given alphabet "+" "+s + " " + "is Vowel");
            } else {
                System.out.println("The given alphabet "+" "+s + " " + "is Consonant");
            }
        };
        c.accept(alpha);
    }
}
