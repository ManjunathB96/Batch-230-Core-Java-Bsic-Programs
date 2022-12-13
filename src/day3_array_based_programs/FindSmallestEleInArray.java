package day3_array_based_programs;

public class FindSmallestEleInArray {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9};
        smallestEle(array);
    }

    private static void smallestEle(int[] array) {
        int min =array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]<min){
                min= array[i];
            }
        }
        System.out.println("Smallest Element In A Given Array Is -> "+min);
    }
}
