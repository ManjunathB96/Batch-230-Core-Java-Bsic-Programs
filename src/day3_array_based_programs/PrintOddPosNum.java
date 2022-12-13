package day3_array_based_programs;

public class PrintOddPosNum {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        oddPosNum(arr);
    }
    private static void oddPosNum(int[] arr) {
        for (int i =1; i<arr.length;i=i+2){
            System.out.println("Index ->"+i+" "+"Value ->"+arr[i]);
        }
    }
}
