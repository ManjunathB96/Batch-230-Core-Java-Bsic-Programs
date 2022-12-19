package day3_array_based_programs;

public class RemoveDupAndSortDescendingOrder {
    public static void main(String[] args) {
        int intArr1[] = {1, 3, 8, 5, 6, 1, 1, 1, 2, 4, 9, 7};
        removeDupAndSortDescendingOrder(intArr1);
    }

    private static void removeDupAndSortDescendingOrder(int[] intArr1) {
        int intArr2[] = new int[intArr1.length];
        int count = 0;
        for (int i = 0; i < intArr1.length; i++) {
            boolean isPresent = false;
            for (int j = 0; j < intArr2.length; j++) {
                if (intArr1[i] == intArr2[j]) {
                    isPresent = true;
                    break;
                } else if (intArr1[i] > intArr2[j]) {
                    int temp = intArr1[i];
                    intArr1[i] = intArr2[j];
                    intArr2[j] = temp;
                }
            }
            if (!isPresent) {
                intArr2[count] = intArr1[i];
                count++;
            }
        }
        for (int a : intArr2) {
            System.out.print(a + " ");
        }
    }
}

