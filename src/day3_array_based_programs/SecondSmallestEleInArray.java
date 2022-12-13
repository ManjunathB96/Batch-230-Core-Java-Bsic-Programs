package day3_array_based_programs;

public class SecondSmallestEleInArray {
    public static void main(String[] args) {
        SecondSmallestEleInArray ele = new SecondSmallestEleInArray();
        int arr[] = {2, 5, 9, 4, 3, 7, 16, 12, 6};
        ele.secondSmallestNum(arr);

    }

    public void secondSmallestNum(int[] arr) {
        int temp;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Elements In Descending Order :");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("First Smallest Element is :" + arr[size - 2 + 1]);
        System.out.println("Second Smallest Element is :" + arr[size - 2]);
        System.out.println("Third Smallest Element is :" + arr[size - 3]);

    }
}
