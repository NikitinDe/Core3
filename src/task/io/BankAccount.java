package task.io;
//TODO: Создайте класс, который представляет банковский счет. Реализуйте метод для снятия денег со
//  счета. Обработайте исключение, если на счете недостаточно средств.
public class BankAccount {
    public static void main(String[] args) throws  Exception{
        BankAccount bankAccount = new BankAccount(600);
        bankAccount.withdrawalMoney(500);
    }
    private int account;

    public BankAccount(int account) {
        this.account = account;
    }

    public void withdrawalMoney(int money) {
        try {
            if (money >= account) {
                throw new Exception();
            }
            account -= money;
            System.out.println("На балансе:" + account);
        } catch (Exception e) {
            System.out.println("На балансе нет денег: ");;
        }


    }

}



