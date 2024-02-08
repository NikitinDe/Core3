package task.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
// TODO: Преобразовать список строк в список их длин. Описание: Напишите программу, которая принимает список строк в
//  качестве входных данных и преобразует его в список их длин с использованием стримов.
public class ConvertingStringList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите cписок элементов через пробел : ");
        String element = scanner.nextLine();
        List<String> list = new ArrayList<>();
        convertingStringList(element,list);
    }
    public static void convertingStringList(String element,List<String> list){
        String[]strings = element.split(" ");
        for (String el : strings) {
            list.add(el);
        }
        List<Integer> list2 = list.stream()
                .map(e -> e.length())
                .collect(Collectors
                        .toList());
        System.out.println(list2);

    }
}
