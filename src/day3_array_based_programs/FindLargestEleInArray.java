package day3_array_based_programs;

public class FindLargestEleInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 9};
        largestEle(arr);
    }

    private static void largestEle(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest Element In given Array Is :->" + max);
    }
}
