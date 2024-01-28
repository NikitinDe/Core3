package task.io;

import java.io.*;
import java.util.Scanner;

public class WritingString {
    public static void main(String[] args) throws IOException {
        String str = "Hello Java, i am love Java";
        File file = new File("Wrfile.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(file))) {
            bufferedWriter.write(str);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Scanner scanner = new Scanner(file);
            String string = scanner.next();
            scanner.close();
            System.out.println(string);
        } catch (IOException e) {
            throw new IOException("Файл не найден");
        }
    }
}
