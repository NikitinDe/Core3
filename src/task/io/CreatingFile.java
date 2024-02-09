package task.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
// TODO:Напишите программу, которая создает новый файл и записывает в него данные, которые передаются
//  строкой

public class CreatingFile {
    public static void main(String[] args)throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку которую хотите записать в файл: ");
        String str = scanner.nextLine();
        File file = new File("newFail.txt");
        creatingFile(str,file);
    }
    public static void creatingFile(String str,File file){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(str);
            writer.close();
            System.out.println("Файл создан и  ваша переданная строка записана в файл !");
        } catch (IOException e) {
            System.out.println("Файл не записан!");
        }
    }
}
