package task.io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividingNumber {
    public static void main(String[] args) {


        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter a number:");
        try {
            int number = scaner.nextInt();
            System.out.println("Enter the second number:");
            int number2 = scaner.nextInt();
            double result = dividingNumber(1, 2);
            System.out.println("Result = " + result);
        } catch (Exception e) {
            throw new InputMismatchException("No number enter!");
        }
    }
    public static double dividingNumber(int number, int number2) {
        return (double) number / number2;

    }
}
