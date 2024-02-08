package task.io;

import java.util.InputMismatchException;
import java.util.Scanner;
// TODO: Напишите программу, которая делит одно число на другое и выводит результат. Обработайте
//  исключение, если введены некорректные данные (например, вместо числа введена строка).
public class DividingNumber {
    public static void main(String[] args) throws Exception {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number =0;
        try {
            number = scaner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введено не число");
            return;
        }
        System.out.println("Enter the second number:");
        int number2 = 0;
        try {
            number2 = scaner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введено не число");
            return;
        }
        dividingNumber(number,number2);
    }
    public static void  dividingNumber(int number, int number2)  {
        try {
            double res = number / number2;
            System.out.println("Result = " + res);
        } catch (Exception e) {
            System.out.println("No number enter!");
        }
    }
}
