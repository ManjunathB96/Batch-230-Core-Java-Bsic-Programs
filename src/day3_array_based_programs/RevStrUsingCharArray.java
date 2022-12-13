package day3_array_based_programs;

public class RevStrUsingCharArray {
    public static void main(String[] args) {
        String str = "MANJU";
        reverseStr(str);
    }

    private static void reverseStr(String str) {
        String rev = " ";
        char[] chars = str.toCharArray();
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + chars[i] + " ";              // " " => used to provide space between elements
        }
        System.out.println("Reverse Of String Using toCharArray Method :"+rev);
    }
}
