package day3_array_based_programs;

public class RemoveDupChar {
    public static void main(String[] args) {
        char baseArray[] = {'m', 'a', 'n', 'm', 'a', 'n', 'j', 'u', 'j'};
        removeDupChar(baseArray);
    }

    private static void removeDupChar(char[] baseArray) {
        char newArr[] = new char[baseArray.length];
        int count = 0;
        for (int i = 0; i < baseArray.length; i++) {
            boolean isPresent = false;
            for (int j = 0; j < newArr.length; j++) {
                if (baseArray[i] == newArr[j]) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                newArr[count] = baseArray[i];
                count++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");      //output :m a n j u
        }
      /*  for (int array : newArr){
            System.out.print(array+" ");
            }
     //output is 109 97 110 106 117 0 0 0 0 the numbers it is printing bcz it taking ascii value i,e unique code
*/
        for (int array : newArr) {
            System.out.print((char) array + " "); //output : m a n j u
        }
    }

}




