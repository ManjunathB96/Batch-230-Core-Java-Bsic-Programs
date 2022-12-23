package day_5_basic_core_java_and_functional_programs;

import java.util.Scanner;

abstract class FlipCoinAndFindPercentageOfHeadAndTail {
    abstract void flipCoin(int flips);
    void display(){
        System.out.println("Flip Coin program is implemented using Abstract class ");
    }

}

class FlipCoinImpl extends FlipCoinAndFindPercentageOfHeadAndTail {

    @Override
    void flipCoin(int flips) {
        int heads = 0;
        int tails = 0;
        int count = 1;
        double random = 0.0;
        while (count <= flips) {
            random = Math.random();
            System.out.println(count + " " + random);

            if (random < 0.5) {
                heads++;
                System.out.println("Heads");
            } else {
                tails++;
                System.out.println("Tails");
            }
            count++;
        }
        System.out.println();
        System.out.println("Number of heads :" + heads);
        System.out.println("Number of tails :" + tails);

        double percentage1 = (double) heads / flips * 100;
        double percentage2 = (double) tails / flips * 100;
        System.out.println("Percentage of heads :" + percentage1);
        System.out.println("Percentage of tails :" + percentage2);

    }
}

class FlipCoinMain {
    public static void main(String[] args) {
        FlipCoinImpl coin = new FlipCoinImpl();
        coin.display();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Flips.....!");
        int flips = sc.nextInt();
        coin.flipCoin(flips);
    }
}
