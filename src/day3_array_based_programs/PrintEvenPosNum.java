package day3_array_based_programs;

public class PrintEvenPosNum {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        printEvenNum(arr);
    }

    public static void printEvenNum(int[] array) {
        for (int i = 2; i < array.length; i = i + 2) {
            System.out.println("Index =" + i + " " + "Value =" + array[i]);
        }
    }
}
