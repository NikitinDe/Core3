package task.io;

public class BankAccount {

    private int account;

    public BankAccount(int account) {
        this.account = account;
    }

    public void withdrawalMoney(int money) {
        try {
            if (money >= account) {
                throw new ArithmeticException("\n" +
                        "недостаточно денег на счете\n" +
                        "there is not enough money in the account");
            }
            account -= money;
            System.out.println("На балансе:" + account);
        } catch (ArithmeticException e) {
            System.out.println("Исключение");
        }


    }

}



