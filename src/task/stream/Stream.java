package task.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Stream {
    public static void main(String[] args) {
        addingNumbers();
        System.out.println();
        filteringWords();
        System.out.println();
        listSquares();
        System.out.println();
        convertingStringUppercase();
    }
    //Реализуйте функциональность согласно описанию
    // TODO: Напишите метод, который принимает два числа от пользователя и использует функциональный интерфейс BinaryOperator
//      для сложения этих чисел и вывода результата.
    public static void addingNumbers() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scaner.nextInt();
        System.out.println("Enter too number:");
        int number2 = scaner.nextInt();
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        int res = binaryOperator.apply(number, number2);
        System.out.println(res);
    }

    // TODO: Напишите метод, который принимает список слов от пользователя и использует функциональный интерфейс Predicate
    //  для фильтрации слов, начинающихся с определенной буквы, и вывода отфильтрованного списка.
    public static void filteringWords() {
        Scanner scaner = new Scanner(System.in);
        System.out.print("введите слова через пробел :");
        String str = scaner.nextLine();
        System.out.print("Введите символ:");
        char str2 = scaner.nextLine().charAt(0);
        List<String> stringlist = new ArrayList<>();
        String[]strings = str.split(" ");
        for (String word : strings) {
            stringlist.add(word);
        }
        Predicate<String> predicate = word -> word.startsWith(String.valueOf(str2));
        List<String> fil = new ArrayList<>();
        for (String word : stringlist) {
            if (predicate.test(word)) {
                fil.add(word);
            }
        }
        System.out.println(fil);
    }

    // TODO: Напишите метод, который принимает список чисел от пользователя и использует функциональный интерфейс Function
//           для преобразования каждого числа в его квадрат и вывода списка квадратов.
    public static void listSquares() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите  список чисел через пробел :");
        String str = scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        String[] strings = str.split(" ");
        for (String val : strings) {
            list.add(Integer.parseInt(val));
        }
        Function<Integer, Integer> function = e -> e * e;
        List<Integer> integerList = new ArrayList<>();
        for (Integer r : list) {
            integerList.add(function.apply(r));
        }
        System.out.println(integerList);
    }

    // TODO: Напишите метод, который принимает список строк от пользователя и использует функциональный интерфейс Consumer
    //  для вывода каждой строки в верхнем регистре.
    public static void   convertingStringUppercase() {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Введите слова через пробел: ");
        String str = scanner.nextLine();
        List<String> list = new ArrayList<>();
        String[] string = str.split(" ");
        for (String s : string)
            list.add(s);

        Consumer<String> consumer = e -> System.out.println("Ваши слова только большими буквами "+e.toUpperCase());
        for(String s1:list){
            consumer.accept(s1);
        }

    }
}

