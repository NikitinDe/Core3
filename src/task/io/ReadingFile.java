package task.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// TODO: Напишите программу, которая считывает данные из файла и выводит их на экран. Обработайте
//  исключение, если файл не найден.
public class ReadingFile {
    public static void main(String[] args) throws Exception {
        reding();
    }
    public static void reding(){
        try {
            FileReader reader = new FileReader("newFail.txt");
            int cha;
            while ((cha = reader.read()) != -1) {
                System.out.print((char)cha);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("файл не найден");;
        }

        }
    }

