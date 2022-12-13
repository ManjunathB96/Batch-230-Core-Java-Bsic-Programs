package day2_bridgelabz_basic_programs;

public class EuclideanDistance {
    public static void main(String[] args) {
        long x, y;
        double distance;
        x = Long.parseLong(args[0]);
        y = Long.parseLong(args[1]);
        distance = Math.sqrt(x*x+y*y);
        System.out.println(distance);
    }
}
/*
input: 2 4
output: 4.47213595499958
 */