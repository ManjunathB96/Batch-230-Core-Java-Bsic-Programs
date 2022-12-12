package day2_bridgelabz_basic_programs;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Input Values a,b,c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double delta = Math.sqrt((b * b) - 4 * a * c);

        double root1 = -b + delta;
        root1 = root1 / (2 * a);
        System.out.println("X = " + root1);


        double root2 = -b - delta;
        root2 = root2 / (2 * a);
        System.out.println("X = " + root2);


    }
}


/*
1)Solve for X :3x^2+2x-1=0
Enter Three Input Values a,b,c
3
2
-1
X = 0.3333333333333333
X = -1.0

2)Solve for X : 11x^2+18x+7=0
Enter Three Input Values a,b,c
11
18
7
X = -0.6363636363636364
X = -1.0output
 */
