package task.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConnectingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите cписок элементов через пробел : ");
        String element = scanner.nextLine();
        List<String> list = new ArrayList<>();
        for (String el : element.split(" ")) {
            list.add(el);
        }
        String stringList = list.stream().collect(Collectors.joining(","));
        System.out.println(stringList);
    }
}
