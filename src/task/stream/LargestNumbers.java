package task.stream;

import java.util.ArrayList;
import java.util.List;
// TODO: Найти наибольшее число в списке. Описание: Напишите программу, которая принимает список чисел в качестве входных
//  данных и находит наибольшее число с использованием стримов.
public class LargestNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        largestNumbers(list);
    }
    public static void largestNumbers(List<Integer>list){
        int result = list.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);
        System.out.println(result);

    }
}
