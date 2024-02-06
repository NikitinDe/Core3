package task.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите набор чисел через пробел: ");
        String str = scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        for (String lis : str.split(" ")) {
            list.add(Integer.parseInt(lis));
        }
        int result = list.stream().mapToInt(Integer::intValue).min().orElse(1);
        System.out.println("Минимальное число в списке = " + result);
    }
}
