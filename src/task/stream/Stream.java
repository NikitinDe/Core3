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
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scaner.nextInt();
        System.out.println("Enter too number:");
        int number2 = scaner.nextInt();
        scaner.nextLine();

        addingNumbers(number,number2);

        System.out.println();
        System.out.print("введите слова через пробел :");
        String str = scaner.nextLine();
        System.out.print("Введите символ:");
        char str2 = scaner.nextLine().charAt(0);
        filteringWords(str,str2);

        System.out.println("Введите  список чисел через пробел :");
        String str1 = scaner.nextLine();
        listSquares(str1);

        System.out.print("ведите список слов через пробел: ");
        String str3=scaner.nextLine();
        convertingStringUppercase(str3);
    }
    //Реализуйте функциональность согласно описанию
    // TODO: Напишите метод, который принимает два числа от пользователя и использует функциональный интерфейс BinaryOperator
//      для сложения этих чисел и вывода результата.
    public static void addingNumbers(int number, int number2) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        int res = binaryOperator.apply(number, number2);
        System.out.println(res);
    }

    // TODO: Напишите метод, который принимает список слов от пользователя и использует функциональный интерфейс Predicate
    //  для фильтрации слов, начинающихся с определенной буквы, и вывода отфильтрованного списка.
    public static void filteringWords(String str,char str2) {
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
    public static void listSquares(String str1) {
        List<Integer> list = new ArrayList<>();
        String[] strings = str1.split(" ");
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
    public static void   convertingStringUppercase(String str3) {
        List<String> list = new ArrayList<>();
        String[] string = str3.split(" ");
        for (String s : string)
            list.add(s);

        Consumer<String> consumer = e -> System.out.println(e.toUpperCase());
        for(String s1:list){
            consumer.accept(s1);
        }
    }
}
// TODO: Найти сумму всех чисел в списке. Описание: Напишите программу, которая принимает список целых чисел в качестве
//  входных данных и вычисляет их сумму с использованием стримов.


// TODO: Найти среднее значение всех чисел в списке. Описание: Напишите программу, которая принимает список чисел в качестве
//  входных данных и вычисляет их среднее значение с использованием стримов.


// TODO: Найти наибольшее число в списке. Описание: Напишите программу, которая принимает список чисел в качестве входных
//  данных и находит наибольшее число с использованием стримов.


// TODO: Найти наименьшее число в списке. Описание: Напишите программу, которая принимает список чисел в качестве входных
//  данных и находит наименьшее число с использованием стримов.


// TODO: Проверить, содержит ли список определенное значение. Описание: Напишите программу, которая принимает список
//  элементов и определенное значение в качестве входных данных и проверяет, содержит ли список это значение с использованием
//  стримов.


// TODO: Удалить дубликаты из списка. Описание: Напишите программу, которая принимает список элементов в качестве входных
//  данных и удаляет все дубликаты, оставляя только уникальные элементы с использованием стримов.


// TODO: Преобразовать список строк в список их длин. Описание: Напишите программу, которая принимает список строк в
//  качестве входных данных и преобразует его в список их длин с использованием стримов.


// TODO: Соединить все строки из списка в одну строку. Описание: Напишите программу, которая принимает список строк в
//  качестве входных данных и соединяет их все в одну строку с использованием стримов.


// TODO: Отфильтровать список чисел, оставив только четные числа. Описание: Напишите программу, которая  принимает список
//  чисел в качестве входных данных и фильтрует его, оставляя только четные числа с использованием стримов.
