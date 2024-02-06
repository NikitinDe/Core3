package task.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EnterText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String string = scanner.nextLine();
        File file = new File("Задача2.txt");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(string);
            writer.close();
            System.out.println("Ваш текст записан в новый файл!");
        } catch (IOException e) {
            System.out.println("Файл не записан");
        }
    }
}

//   Напишите программу, в которой при запуске приложения вы вводите в консоль текст и на основе
//  введенного текста создается файл