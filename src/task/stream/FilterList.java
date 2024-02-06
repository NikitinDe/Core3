package task.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterList {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите список чисел через пробел: ");
        String str = scaner.nextLine();
        List<Integer> list = new ArrayList<>();
        for (String r : str.split(" ")) {
            list.add(Integer.parseInt(r));
        }
        System.out.println("До сортировки через поток: " + list);
        List<Integer> result = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println("После сортировки через поток");
        System.out.println(result);
    }
}
