package task.io;

import java.io.*;

public class CreatingFile {
    public static void main(String[] args) {
        String str = "Hello world";
        File file = new File("newFail.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(str);
            writer.close();
            System.out.println("Файл создан и записан!");
        } catch (IOException e) {
            System.out.println("Исключение");
        }
    }
}
