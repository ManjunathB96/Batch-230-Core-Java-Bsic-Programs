package day3_array_based_programs;

public class RemoveDupChar {
    public static void main(String[] args) {
        char beforeArr[] = {'x', 'a', 'f', 'h', 'a', 'h', 'a'};
        removeDupChar(beforeArr);
    }
    private static void removeDupChar(char[] beforeArr) {
        int size = beforeArr.length;
        int temp = 0;
        char afterArr[] = new char[size];
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if ( beforeArr[i] == afterArr[j] ) {
                    break;
                }
                if (i == temp){
                    afterArr[temp] = beforeArr[i];
                    temp++;
                }
            }
        }
        for (int i =0;i<size;i++){
            System.out.print(afterArr[i]+" ");
        }
    }

}


