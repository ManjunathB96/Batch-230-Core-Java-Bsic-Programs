package day3_array_based_programs;

public class CountEachCharFromString {
    public static void main(String[] args) {
        String str = "Welcome To Bridgelabz";
        countChars(str);
    }
    public static void countChars(String str) {
        String str2=str.toLowerCase();
        int freq[] = new int[256];
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) != ' ') {
                char c = str2.charAt(i);
                freq[c]++;
            }
        }
        for (int j = 0; j < freq.length; j++) {
            if (freq[j] != 0) {
                System.out.println("Frequency of " + (char) j + " ->" + freq[j]);
            }
        }
    }
}
