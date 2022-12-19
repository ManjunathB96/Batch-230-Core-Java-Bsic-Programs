package day3_array_based_programs;

public class RemoveDupInt {
    public static void main(String[] args) {
        int[] intArr1 = {1, 2, 5, 1, 4, 2, 3, 1, 5, 2};
        removeDupIntFromArray(intArr1);
    }

    private static void removeDupIntFromArray(int[] intArr1) {
        int[] intArr2 = new int[intArr1.length];
        int count = 0;
        for (int i = 0; i < intArr1.length; i++) {
            boolean isPresent = false;
            for (int j = 0; j < intArr2.length; j++) {
                if (intArr1[i] == intArr2[j]) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                intArr2[count] = intArr1[i];
                count++;
            }
        }
        for (int array : intArr2) {
            System.out.print(array + " ");

        }
    }

}
