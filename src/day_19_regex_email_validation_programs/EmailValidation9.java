package day_19_regex_email_validation_programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation9 {
    public static void main(String[] args) {
        String emailId = "abc+100@gmail.com";

        Pattern pattern = Pattern.compile("^([a-zA-Z]{3,}([.|_|+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$");
        Matcher matcher = pattern.matcher(emailId);

        if (matcher.matches() == true) {
            System.out.println(emailId + "  " + " Result->" + matcher.matches() + " " + "Valid Email Id");
        } else {
            System.out.println(emailId + "  " + "Result->" + matcher.matches());
            System.out.println("Please Enter Valid Email Id....!");
        }
    }
}
