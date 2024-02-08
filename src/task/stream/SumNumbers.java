package task.stream;
// TODO: Найти сумму всех чисел в списке. Описание: Напишите программу, которая принимает список целых чисел в качестве
//  входных данных и вычисляет их сумму с использованием стримов.
import task.io.ListStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите список чисел через пробел: ");
        String str = scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        sum(list,str);
    }
    public static void sum(List<Integer>list,String str){
        String[]strings =str.split(" ");
        for (String num : strings) {
            list.add(Integer.parseInt(num));
        }
        int res = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Сумма введенных данных = " + res);

    }
}
