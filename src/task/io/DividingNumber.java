package task.io;

import java.util.InputMismatchException;
import java.util.Scanner;
// TODO: Напишите программу, которая делит одно число на другое и выводит результат. Обработайте
//  исключение, если введены некорректные данные (например, вместо числа введена строка).
public class DividingNumber {
    public static void main(String[] args) throws Exception {
        dividingNumber();
    }
    public static void  dividingNumber()  {
        Scanner scaner= new Scanner(System.in);
        try {
            System.out.println("Enter a number:");
          int  number = scaner.nextInt();
            System.out.println("Enter the second number:");
            int  number2 = scaner.nextInt();
            if(number2==0){
                throw new ArithmeticException("На ноль делить нельзя");
            }
            double res = number / number2;
            System.out.println("Result = " + res);
        } catch (InputMismatchException e) {
            System.out.println("Введено не число");
        }
    }
}
