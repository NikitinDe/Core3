package task.stream;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
// TODO: Отфильтровать список чисел, оставив только четные числа. Описание: Напишите программу, которая  принимает список
//  чисел в качестве входных данных и фильтрует его, оставляя только четные числа с использованием стримов.
public class FilterList {
    public static void main(String[] args) {
        filterList();
    }

    public static void filterList() {
        try {
            Scanner scaner = new Scanner(System.in);
            System.out.println("Введите список чисел через пробел: ");
            String str = scaner.nextLine();
            List<Integer> list = new ArrayList<>();
            String[] strings = str.split(" ");
            for (String r : strings) {
                list.add(Integer.parseInt(r));
            }
            List<Integer> result = list.stream()
                    .filter(e -> e % 2 == 0)
                    .collect(Collectors.toList());
            System.out.println(result);
        }catch (NumberFormatException e){
            throw new NumberFormatException("Введено не число");
        }
    }
}
