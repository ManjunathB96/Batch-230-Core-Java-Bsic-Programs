package day_19_regex_programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmailUC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Email Id");
        String emailId = sc.nextLine();

        Pattern pattern = Pattern.compile("^([a-zA-Z]{3,}([.|_|+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$");
        Matcher matcher = pattern.matcher(emailId);

        if (matcher.matches() == true) {

            System.out.println(emailId + "  " + "Valid Email Id Result->" + matcher.matches());
        } else {
            System.out.println(emailId + "  " + "Not valid Email Id Result->" + matcher.matches());
        }


    }
}
//"^([a-zA-Z]{3,}([.|_|+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$"