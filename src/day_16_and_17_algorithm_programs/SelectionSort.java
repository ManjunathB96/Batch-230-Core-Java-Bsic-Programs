package day_16_and_17_algorithm_programs;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        selectionSorting(arr);

    }
    public static void selectionSorting(int[] arr){
        for (int i =0;i< arr.length-1;i++){
            int smallest=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        System.out.println("Array Sorted Using Selection Sort Technique :"+Arrays.toString(arr));
    }
}
