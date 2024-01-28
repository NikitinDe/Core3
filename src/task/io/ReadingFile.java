package task.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("newFail.txt");
            int cha;
            while ((cha = reader.read()) != -1) {
                System.out.print((char)cha);
            }
            reader.close();
            System.out.println();
            System.out.println("FileReader!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        }
    }

