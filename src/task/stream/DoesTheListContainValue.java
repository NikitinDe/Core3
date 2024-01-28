package task.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoesTheListContainValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите cписок элементов через пробел : ");
        String element = scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        for (String el : element.split(" ")) {
            list.add(Integer.parseInt(el));
        }
        System.out.println("Введите значение для проверки: ");
        int value = scanner.nextInt();
        boolean result = list.stream().anyMatch(e -> e.equals(value));
        if (result) {
            System.out.println("Заданное значение есть в списке:  ");
        } else {

            System.out.println("Заданного значения нет в списке!");
        }
    }
}
