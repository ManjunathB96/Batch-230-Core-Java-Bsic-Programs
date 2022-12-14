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
     //output is 109 97 110 106 117 0 0 0 0 the numbers it is printing bcz it taking ASCII value i,e unique code
     these values only for lower case letters and not  for UpperCase letters  The code values are different for UpperCase letters
    char -> m -> decimal -> 109  or hex->6D  or oct->155
     char -> a -> decimal -> 97  or hex->61  or oct->141
      char -> n -> decimal -> 110  or hex->6E  or oct->156
       char -> j -> decimal -> 106  or hex->6A  or oct->152
        char -> u -> decimal -> 117  or hex->75  or oct->165


*/
        for (int array : newArr) {
            System.out.print((char) array + " "); //output : m a n j u
        }
    }

}




