package day11_bank_account_sevice_program;

public class AccountDetails {
    protected double bal =1000;
    protected int pwd;
    protected double money;

    @Override
    public String toString() {
        return "AccObjects{" +
                "bal=" + bal +
                ", pwd=" + pwd +
                ", money=" + money +
                '}';
    }
}
