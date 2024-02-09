package task.io;


import java.util.Scanner;

public class ReadWriteFileExceptionHandling {
    public static void main(String[] args) throws Exception {
        int res = dividesNumbers();
        System.out.println("Результат = " + res);
        int result = stringConversion();
        System.out.println("Результат: "+ result);

    }
    // TODO: Cоздайте метод, который делит два числа и возвращает результат. Обработайте исключение,
    //    //  если второе число равно нулю
    public static int  dividesNumbers() {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            int number1 = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int number2 = scanner.nextInt();
            if (number2 == 0) {
                throw new RuntimeException();
            }
           return number1 / number2;
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");

        }
        return 0;
    }


    // TODO: Создайте метод, который преобразует строку в число. Обработайте исключение, если строка не
    //  может быть преобразована в число.
    public static int  stringConversion() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите слово: ");
            String str = scanner.nextLine();
            return Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            System.out.println("Строка не преобразована:" );
        return 0;
        }
    }

}