package task.stream;

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
        for (String num : str.split(" ")) {
            list.add(Integer.parseInt(num));
        }
        int res = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Сумма введенных данных = " + res);

    }
}
