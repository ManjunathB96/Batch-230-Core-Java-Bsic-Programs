package day3_array_based_programs;

public class PrintEleOfArray {
    public static void main(String[] args) {
        PrintEleOfArray ele = new PrintEleOfArray();
        int intArray[] = {10, 20, 30, 40, 50, 60};
        String strArray[] = {"Manjunath", "Azharuddin", "Anand", "Basu"};
        char charArray[] = {'a', 'b', 'c', 'd', 'e', 'f'};

        ele.printIntArray(intArray);
        System.out.println();
        ele.printStrArray(strArray);
        System.out.println();
        ele.printCharArray(charArray);
    }
    private void printIntArray(int[] intArray) {
        int size1 = intArray.length;
        for (int i = 0; i < size1; i++) {
            System.out.print(intArray[i]+" ");
        }
    }
    private void printStrArray(String[] strArray) {
        int size2 = strArray.length;
        for (int i = 0; i < size2; i++) {
            System.out.print(strArray[i]+" ");
        }
    }
    private void printCharArray(char[] charArray) {
        int size3 = charArray.length;
        for (int i = 0; i < size3; i++) {
            System.out.print(charArray[i]+" ");

        }
    }
}
