package day3_array_based_programs;

class SecondLargestEleInArray {
    public static void main(String[] args) {
        int arr[] = {2, 7, 8, 12, 6, 15, 17, 9};
        secondLargestNum(arr);

    }

    private static void secondLargestNum(int[] arr) {
        int temp;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Elements In Ascending Order ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("First largest Element In Array Is :" + arr[size - 2 + 1]);
        System.out.println("Second largest Element In Array Is :" + arr[size - 2]);
        System.out.println("Third largest Element In Array Is :" + arr[size - 3]);

    }
}
