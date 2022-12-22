package day_19_regex_programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastNameUC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your last name :");
        String lastName = sc.nextLine();

        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}");
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches() == true) {
            System.out.println(lastName + "  " + "Valid name Result->" + matcher.matches());
        } else {
            System.out.println(lastName + "  " + "Not valid name Result->" + matcher.matches());
        }

    }
}
