package day11_bank_account_sevice_program;

public class Customer {
    public static void main(String[] args) {
        System.out.println("Welcome to Bank Services...!");
        BankServiceImpl service = new BankServiceImpl();
        service.withdraw();
    }
}
