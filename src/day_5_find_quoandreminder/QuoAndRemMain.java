package day_5_find_quoandreminder;

import java.util.Scanner;
/*
public class QuoAndRemMain {
    public static void main(String[] args) {
        QuoAndRemImpl e=new QuoAndRemImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend value");
        e.setDividend(sc.nextInt());
        System.out.println("Enter the divider value");
        e.setDivisor(sc.nextInt());

       e.findQuoAndRem();


    }
}


 */

public class QuoAndRemMain {
    public static void main(String[] args) {
        Elements e=new Elements();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend value");
        e.setDividend(sc.nextInt());
        System.out.println("Enter the divider value");
        e.setDivisor(sc.nextInt());

        QuoAndRemImpl impl= new QuoAndRemImpl();
        int d1=e.getDividend();
        int d2=e.getDivisor();
        impl.findQuoAndRem(d1,d2);
    }
}