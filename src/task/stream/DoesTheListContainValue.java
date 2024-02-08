package task.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// TODO: Проверить, содержит ли список определенное значение. Описание: Напишите программу, которая принимает список
//  элементов и определенное значение в качестве входных данных и проверяет, содержит ли список это значение с использованием
//  стримов.
public class DoesTheListContainValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите cписок элементов через пробел : ");
        String element = scanner.nextLine();
        System.out.println("Введите значение для проверки: ");
        int value = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        doesTheListContainValue(list,element,value);
    }
    public static void doesTheListContainValue(List<Integer> list, String element, int value) {
        String[] strings = element.split(" ");
        for (String el : strings) {
            list.add(Integer.parseInt(el));
        }
        boolean result = list.stream()
                .anyMatch(e -> e.equals(value));
        if (result) {
            System.out.println("Заданное значение есть в списке:  ");
        } else {
            System.out.println("Заданного значения нет в списке!");
        }
    }
}
