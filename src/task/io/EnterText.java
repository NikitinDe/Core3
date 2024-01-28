package task.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
// TODO: Напишите программу, в которой при запуске приложения вы вводите в консоль текст и на основе
//  введенного текста создается файл
public class EnterText {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String string = scanner.nextLine();
        File file = new File("Задача2.txt");
        enterText(string,file);
    }
    public static void enterText(String string,File file){
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

