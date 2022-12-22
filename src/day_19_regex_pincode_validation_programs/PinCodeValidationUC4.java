package day_19_regex_pincode_validation_programs;

public class PinCodeValidationUC4 {
    static String VALID_PINCODE_UC4 = "^([0-9]{3}[ ]{0,1}[0-9]{3})$";

    public static void main(String[] args) {
        String pinCode = "400 088";
        System.out.println(pinCode.matches(VALID_PINCODE_UC4));

    }
}
