package task.io;

import java.io.*;
import java.util.Scanner;
// TODO: Напишите программу, которая создает файл из текста, который подается строкой, а потом
//  считывает первое слово из файла
public class WritingString {
    public static void main(String[] args) throws IOException {
        String str = "Hello Java, i am love Java";
        File file = new File("Wrfile.txt");
        writing(str,file);
    }
    public static void writing(String str, File file){
        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(file))) {
            bufferedWriter.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Scanner scanner = new Scanner(file);
            String string = scanner.next();
            scanner.close();
            System.out.println(string);
        } catch (IOException e) {
            System.out.println("Файл не найден");
        }
    }
}
