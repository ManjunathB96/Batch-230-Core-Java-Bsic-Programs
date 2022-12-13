package day3_array_based_programs;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ABCD";
        reverseString(str);
    }

    private static void reverseString(String str) {
        String rev = " ";
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i)+" ";
        }
        System.out.println("Reverse Of String is :"+rev);
    }
}
