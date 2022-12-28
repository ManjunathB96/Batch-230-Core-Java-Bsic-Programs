package day_5_find_quoandreminder;

public class Elements {
    private int dividend;
    private int divisor;

    public int getDividend() {
        return dividend;
    }

    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    @Override
    public String toString() {
        return "Encap{" +
                "dividend=" + dividend +
                ", divisor=" + divisor +
                '}';
    }
}

