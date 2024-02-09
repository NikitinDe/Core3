package task.io;

import java.util.InputMismatchException;
import java.util.Scanner;
// TODO: Напишите программу, которая считывает число с клавиатуры и выводит его квадрат. Обработайте
//  исключение, если введено не число
public class Square {
    public static void main(String[] args) throws Exception {

        squareNumber();
    }

    public static void squareNumber() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число:");
            int integer = scanner.nextInt();
            System.out.println(integer * integer);
        } catch (Exception e) {
            throw new InputMismatchException("Введено не число!");
        }
    }
}
