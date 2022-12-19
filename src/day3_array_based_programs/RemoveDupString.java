package day3_array_based_programs;

public class RemoveDupString {
    public static void main(String[] args) {
        String str[] = {"manju", "manju", "rohan", "manju", "rohan", "manju"};
        removeDup(str);
    }

    private static void removeDup(String[] str) {
        String str2[] = new String[str.length];

        int count = 0;
        for (int i = 0; i < str.length; i++) {
            boolean isPresent = false;
            for (int j = 0; j < str2.length; j++) {
                if (str[i] == str2[j]) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                str2[count] = str[i];
                count++;
            }

        }
        for (String arr : str2) {
            System.out.print(arr + " ->");

        }
    }
}
