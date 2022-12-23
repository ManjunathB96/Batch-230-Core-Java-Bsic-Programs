package day_5_basic_core_java_and_functional_programs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

public class MaxAmong3Num {
    int num1;
    int num2;
    int num3;

    public MaxAmong3Num(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

}

class ManinMax {
    public static void main(String[] args) {
        ArrayList<MaxAmong3Num> maxList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number...!");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number...!");
        int n2 = sc.nextInt();
        System.out.println("Enter Third Number...!");
        int n3 = sc.nextInt();
        maxList.add(new MaxAmong3Num(n1, n2, n3));

        Function<MaxAmong3Num, Integer> fn = e -> {
            int num1 = e.num1;
            int num2 = e.num2;
            int num3 = e.num3;

            if (num1 > num2) {
                if (num1 > num3) {
                    return num1;
                } else {
                    return num3;
                }
            } else {
                if (num2 > num3) {
                    return num2;
                } else {
                    return num3;
                }
            }

        };

        for (MaxAmong3Num max : maxList) {
            int largest = fn.apply(max);
            System.out.println(largest+"  "+"Is The Largest Among Three Input Values");
        }
    }
}
