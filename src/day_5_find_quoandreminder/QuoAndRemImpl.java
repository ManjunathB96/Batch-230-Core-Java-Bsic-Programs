package day_5_find_quoandreminder;
/*
public class QuoAndRemImpl  extends Elements {

    public void findQuoAndRem() {
        int quotient = getDividend() / getDivisor();
        int reminder = getDividend() % getDivisor();

        System.out.println("Quotient is :" + " " + quotient);
        System.out.println("Reminder is : " + " " + reminder);
    }

}

*/
public class QuoAndRemImpl  {

    public void findQuoAndRem(int dividend,int divisor) {
        int quotient = dividend/ divisor;
        int reminder = dividend % divisor;

        System.out.println("Quotient is :" + " " + quotient);
        System.out.println("Reminder is : " + " " + reminder);
    }

}
