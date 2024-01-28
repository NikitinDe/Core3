package task.stream;

import java.util.*;

import static java.util.Arrays.stream;

public class AverageValueNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите список чисел через пробел: ");
        String str = scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        for (String sr : str.split(" ")) {
            list.add(Integer.parseInt(sr));
            double result = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
            System.out.println(result);
        }
    }
    }

