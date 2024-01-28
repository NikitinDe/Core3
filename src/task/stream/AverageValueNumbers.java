package task.stream;

import java.util.*;

import static java.util.Arrays.stream;
// TODO: Найти среднее значение всех чисел в списке. Описание: Напишите программу, которая принимает список чисел в качестве
//  входных данных и вычисляет их среднее значение с использованием стримов.
public class AverageValueNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите список чисел через пробел: ");
        String str = scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        avarageValueNumbers(list,str);
    }
    public static void avarageValueNumbers(List<Integer>list,String str){
        String[] strings = str.split(" ");
        for (String sr :strings) {
            list.add(Integer.parseInt(sr));
            double result = list.stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0.0);
            System.out.println(result);
        }
    }
    }

