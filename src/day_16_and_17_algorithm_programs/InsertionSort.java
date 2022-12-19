package day_16_and_17_algorithm_programs;

public class InsertionSort {
    public static void main(String[] args) {
        String str[] = {"I", "karnataka", "from", "am", "belagavi"};
        int n = str.length;
        insertionSort(str, n);
        printArray(str, n);
    }
    public static void insertionSort(String[] str, int n) {
        for (int i = 1; i < n; i++) {
            String temp = str[i];
            int j = i - 1;
            while (j >= 0 && temp.length() < str[j].length()) {
                str[j + 1] = str[j];
                j--;
            }
            str[j + 1] = temp;
        }
    }
    static void printArray(String strArr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(strArr[i] + " ");
        }

    }
}
