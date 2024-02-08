package task.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
// TODO: Удалить дубликаты из списка. Описание: Напишите программу, которая принимает список элементов в качестве входных
//  данных и удаляет все дубликаты, оставляя только уникальные элементы с использованием стримов.
public class DublicatesList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите cписок элементов через пробел : ");
        String element = scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        dublicatesList(list, element);
    }

    public static void dublicatesList(List<Integer> list, String element) {
        String[] strings = element.split(" ");
        for (String el : strings) {
            list.add(Integer.parseInt(el));
        }
        List<Integer> result = list.stream()
                .distinct()
                .collect(Collectors
                        .toList());
        System.out.println(result);
    }
}
