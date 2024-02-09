package task.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// TODO: Найти наибольшее число в списке. Описание: Напишите программу, которая принимает список чисел в качестве входных
//  данных и находит наибольшее число с использованием стримов.
public class LargestNumbers {
    public static void main(String[] args) {

        largestNumbers();
    }
    public static void largestNumbers(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите элементы через пробел: ");
            String res =scanner.nextLine();
            List<Integer> list = new ArrayList<>();
            for(String r:res.split(" ")) {
                list.add(Integer.parseInt(r));
            }
            int result = list.stream()
                    .mapToInt(Integer::intValue)
                    .max()
                    .orElse(0);
            System.out.println(result);
        }catch (NumberFormatException e){
            throw new NumberFormatException("Введено не число");
        }
    }
}
