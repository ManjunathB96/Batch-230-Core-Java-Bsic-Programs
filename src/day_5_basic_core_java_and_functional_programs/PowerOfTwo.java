package day_5_basic_core_java_and_functional_programs;

@FunctionalInterface
interface PowerOfTwoImplUsingLambda {
    void powerOfTwo();
}

public class PowerOfTwo {
    public static void main(String[] args) {
        PowerOfTwoImplUsingLambda pow = () -> {
            int n = Integer.parseInt(args[0]);
            int i = 0;
            int powerOfTwo = 1;
            while (i <= n) {
                System.out.println(i + " " + powerOfTwo);
                powerOfTwo = 2 * powerOfTwo;
                i = i + 1;
            }
        };

        pow.powerOfTwo();
    }
}
