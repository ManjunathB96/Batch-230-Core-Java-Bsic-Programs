package day_16_and_17_binarysearch_algorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
In Binary Search all elements should be in Sorted order if no sorted it will show element not found
 */

public class BinarySearchOfStrByReadingFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner strArray = new Scanner(new File("F:/Batch-230 Core Java Programs/src/day_16_and_17_binarysearch_algorithm/WordsList.txt")).useDelimiter(",\\s*");
        String tempStr = "";
        List<String> list = new ArrayList<String>();
        while (strArray.hasNext()) {
            tempStr = strArray.next();
            list.add(tempStr);
        }
        strArray.close();
        String[] tempArr = list.toArray(new String[0]);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Word You Want To Search....In File");
        String x = sc.nextLine().toLowerCase();
        int result = binarySearch(tempArr, x);
        if (result == -1) {
            System.out.println("Given Word  Not Found....");
        } else {
            System.out.println("Given Word Found At Index :" + "  " + result);
        }
    }

    static int binarySearch(String[] arr, String x) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Words After Sorting :" + Arrays.toString(arr));

        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - 1) / 2;
            int res = x.compareTo(arr[m]);
            if (res == 0)
                return m;
            if (res > 0)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

}


/*
public class BinarySearchOfStrByReadingFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner strArray = new Scanner(new File("F:/Batch-230 Core Java Programs/src/day_16_and_17_algorithm_programs/WordList.txt")).useDelimiter(",\\s*");
        String tempStr = "";
        List<String> list = new ArrayList<String>();
        while (strArray.hasNext()) {
            tempStr = strArray.next();
            list.add(tempStr);
        }
        strArray.close();
        String[] tempArr = list.toArray(new String[0]);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Word You Want To Search....In File");
        String x = sc.nextLine().toLowerCase();
        int result = binarySearch(tempArr, x);
        if (result == -1) {
            System.out.println("Given Word  Not Found....");
        } else {
            System.out.println("Given Word Found At Index :" + "  " + result);
        }
    }

    static int binarySearch(String[] arr, String x) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase();
        }

        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - 1) / 2;
            int res = x.compareTo(arr[m]);
            if (res == 0)
                return m;
            if (res > 0)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

}*/


