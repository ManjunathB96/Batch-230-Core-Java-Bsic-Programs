package day_19_regex_programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMobileNumUC4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Mobile Number along with Country Code(Ex:+91 10 Digit Num)");
        String mobileNum = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[+][0-9]{2}[ ][0-9]{10}");
        Matcher matcher = pattern.matcher(mobileNum);

        if (matcher.matches() == true) {
            System.out.println(mobileNum + "  " + "Valid Mobile Number Result->" + matcher.matches());
        } else {
            System.out.println(mobileNum + "  " + "Not Valid Mobile Number Result->" + matcher.matches());
        }

    }
}
