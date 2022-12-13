package day3_array_based_programs;

public class FindFrequencyOfChar {
    public static void main(String[] args) {
        String str = "Bridge labs solution is great platform to start career in IT field";
        frequencyOfCharEle(str);
    }

    private static void frequencyOfCharEle(String str) {
        char ch = 'e';
        int freq = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                ++freq;
            }
        }
        System.out.println("Frequency of Character Element "+ch+" is => "+ freq);

    }
}
