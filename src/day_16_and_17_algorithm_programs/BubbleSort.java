package day_16_and_17_algorithm_programs;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2, 4, 5, 6, 9};
        System.out.print("Array before sorting : " + Arrays.toString(arr) + " ");
        System.out.println();
        bubbleSorting(arr);
    }

    private static void bubbleSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Array after sorting : " + Arrays.toString(arr) + " ");
    }
}
