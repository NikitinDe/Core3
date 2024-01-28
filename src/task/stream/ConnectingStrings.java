package task.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
// TODO: Соединить все строки из списка в одну строку. Описание: Напишите программу, которая принимает список строк в
//  качестве входных данных и соединяет их все в одну строку с использованием стримов.
public class ConnectingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите cписок элементов через пробел : ");
        String element = scanner.nextLine();
        List<String> list = new ArrayList<>();
        connectingStrings(list,element);
    }
    public static void connectingStrings(List<String> list,String element){
        String[]strings = element.split(" ");
        for (String el : strings) {
            list.add(el);
        }
        String stringList = list.stream()
                .collect(Collectors.joining(","));
        System.out.println(stringList);
    }
}
