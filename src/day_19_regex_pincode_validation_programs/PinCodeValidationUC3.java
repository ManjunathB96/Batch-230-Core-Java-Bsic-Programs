package day_19_regex_pincode_validation_programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeValidationUC3 {
    public static void main(String[] args) {
        String pinCode = "400088B";
        Pattern pattern = Pattern.compile("^[0-9]{6}");
        Matcher matcher = pattern.matcher(pinCode);

        if (matcher.matches() == true) {
            System.out.println(pinCode + "  " + "Valid Pin Code  Result Is:->" + matcher.matches());
        } else {
            System.out.println(pinCode + "  " + "Not valid Pin Code  Result Is:->" + matcher.matches());
        }

    }


}
