package day3_array_based_programs;


public class ReplaceInPutValuesToOpp {
    public static void main(String[] args) {
        String[] baseArr = {"1111", "1110", "1000", "000", "0001", "0111"};
        reverseInPut(baseArr);
    }

    private static void reverseInPut(String[] baseArr) {
        String strArr[] = new String[baseArr.length];
        for (int i = 0; i < baseArr.length; i++) {
            String s = baseArr[i];
            String str = "";
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    str = str + 0;
                } else if (s.charAt(j) == '0') {
                    str = str + 1;
                }
            }

            strArr[i] = str;
        }
        for (String a : strArr) {
            System.out.print(a + " ");
        }
    }
}