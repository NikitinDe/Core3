package task.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;
// TODO: Удалить дубликаты из списка. Описание: Напишите программу, которая принимает список элементов в качестве входных
//  данных и удаляет все дубликаты, оставляя только уникальные элементы с использованием стримов.
public class DublicatesList {
    public static void main(String[] args) {
        dublicatesList();
    }

    public static void dublicatesList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите cписок элементов через пробел : ");
        String element = scanner.nextLine();
        List<String> list = new ArrayList<>();
        String[] strings = element.split(" ");
        for (String el : strings) {
            list.add(el);
        }
        List<String> result = list.stream()
                .distinct()
                .collect(Collectors
                        .toList());
        System.out.println(result);
    }
}
