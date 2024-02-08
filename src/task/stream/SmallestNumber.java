package task.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;
// TODO: Найти наименьшее число в списке. Описание: Напишите программу, которая принимает список чисел в качестве входных
//  данных и находит наименьшее число с использованием стримов.
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите набор чисел через пробел: ");
        String str = scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        smallestNumbers(list,str);
    }
    public static void smallestNumbers(List<Integer>list, String str){
        String[] strings = str.split(" ");
        for (String lis : strings) {
            list.add(Integer.parseInt(lis));
        }
        int result = list.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(1);
        System.out.println("Минимальное число в списке = " + result);
    }
}
