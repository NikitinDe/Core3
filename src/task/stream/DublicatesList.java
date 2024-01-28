package task.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DublicatesList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите cписок элементов через пробел : ");
        String element = scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        for (String el : element.split(" ")) {
            list.add(Integer.parseInt(el));
        }
        System.out.println("Список до удаление дубликатов:" + list);
        List<Integer> result = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Список после удаление дубликатов: " + result);
    }
}
