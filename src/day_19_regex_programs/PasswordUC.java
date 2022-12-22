package day_19_regex_programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordUC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Password");
        String password = sc.nextLine();
        Pattern pattern = Pattern.compile("((?=.*[A-Z])(?=.*[a-z])(?=.*[#%^&@*+<~])(?=.*[0-9]).{8,20})");
        //Pattern pattern = Pattern.compile("((?=.*\\d).{8,20})");
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches() == true) {
            System.out.println(password + "  " + " Result->" + matcher.matches() + " " + "Valid Password");
        } else {
            System.out.println(password + "  " + "Result->" + matcher.matches());
            System.out.println("Please Enter Valid Password....!");
        }
    }
}
