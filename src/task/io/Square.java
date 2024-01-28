package task.io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        try {
            int integer = scanner.nextInt();
            System.out.println(squareNumber(integer));
        } catch (InputMismatchException e) {
            System.out.println("Введено не число!");
        }
    }
    public static int squareNumber(int integer) {
        return integer * integer;

    }

}
