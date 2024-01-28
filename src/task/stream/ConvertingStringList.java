package task.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConvertingStringList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите cписок элементов через пробел : ");
        String element = scanner.nextLine();
        List<String> list = new ArrayList<>();
        for (String el : element.split(" ")) {
            list.add(el);
        }
        System.out.println("До преобразования: " + list);

        List<Integer> list2 = list.stream().map(e -> e.length()).collect(Collectors.toList());
        System.out.println("После преобразования:" + list2);

    }
}
