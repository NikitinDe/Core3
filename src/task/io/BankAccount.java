package task.io;

import java.util.Scanner;

//TODO: Создайте класс, который представляет банковский счет. Реализуйте метод для снятия денег со
//  счета. Обработайте исключение, если на счете недостаточно средств.
public class BankAccount {

    public static void main(String[] args) throws  Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите  сумму которую хотите снять: ");
        int money = scanner.nextInt();
        scanner.nextLine();

        BankAccount bankAccount = new BankAccount(600);
        bankAccount.withdrawalMoney(money);
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
            System.out.print("Сумма " + money+ " успешно снята , с вашего счета .Остаток на балансе: " + account);
        } catch (Exception e) {
            System.out.println("На балансе нет денег: ");;
        }


    }

}



