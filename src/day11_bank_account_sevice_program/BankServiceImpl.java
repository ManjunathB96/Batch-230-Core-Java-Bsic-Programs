package day11_bank_account_sevice_program;

import java.util.Scanner;

public class BankServiceImpl implements BankAccServices {
    @Override
    public void withdraw() {
        AccountDetails objects = new AccountDetails();
        int pwd = objects.pwd;
        double money = objects.money;
        double bal = objects.bal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password");
        pwd = scanner.nextInt();
        if (pwd == 9449) {
            System.out.println("Enter withdraw amount :");
            money = scanner.nextDouble();
            if (money <= bal) {
                bal = bal - money;
                System.out.println("Withdraw money :" + money);
                System.out.println("total balance :" + bal);
            } else if (money > bal) {
                System.out.println("Debit amount exceeded account balance");
            }
        } else {
            System.out.println("incorrect password...!");
        }
    }
}
