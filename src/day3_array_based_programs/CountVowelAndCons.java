package day3_array_based_programs;

public class CountVowelAndCons {
    public static void main(String[] args) {
        String[] str = {"manju", "rohan", "SADASHIV", "iranna"};
        countVowAndCons(str);
    }

    private static void countVowAndCons(String[] str) {
        int vCount = 0, cCount = 0;
        for (int i = 0; i < str.length; i++) {
            String m = str[i];
            m = m.toLowerCase();
            for (int j = 0; j < m.length(); j++) {
                if (m.charAt(j) == 'a' || m.charAt(j) == 'e' || m.charAt(j) == 'i' || m.charAt(j) == 'o' || m.charAt(j) == 'u') {
                    vCount++;
                } else if (m.charAt(i) >= 'a' && m.charAt(i) <= 'z') {
                    cCount++;
                }
            }
        }
        System.out.println("Number of Vowels is :" + vCount + " \n" + "Number of Consonant is :" + cCount);
    }
}
/*public class ReplaceInPutValuesToOpp {
    public static void main(String[] args) {
        String[] baseArr = {"1111", "1110", "1000", "000", "0001", "0111"};
        reverseInPut(baseArr);
    }
    private static void reverseInPut(String[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            String s = intArr[i];

            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    builder.append(0);
                 }
                else if (s.charAt(j) == '0') {
                    builder.append(1);
                }
            }
            intArr[i] =builder.toString();
            System.out.println(builder+" ");
        }

    }
}


 */