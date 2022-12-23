package day_5_basic_core_java_and_functional_programs;

import java.util.Scanner;

public class SwapTwoNum {
    private int firstNum;
    private int secondNum;

    public int setFirstNum(int firstNum) {
        this.firstNum = firstNum;
        return firstNum;
    }

    public int setSecondNum(int secondNum) {
        this.secondNum = secondNum;
        return secondNum;
    }
}

class SwapTwoNumImpl extends SwapTwoNum {
    public void swapTwoNumbers(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping");
        System.out.println("First number :" + num1);
        System.out.println("Second number :" + num2);
    }
}

class SwapMain {
    public static void main(String[] args) {
        SwapTwoNum sObj = new SwapTwoNum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number :");
        int num1 = sObj.setFirstNum(sc.nextInt());
        System.out.println("Enter Second number :");
        int num2 = sObj.setSecondNum(sc.nextInt());

        SwapTwoNumImpl impl = new SwapTwoNumImpl();
        impl.swapTwoNumbers(num1, num2);
    }

}
