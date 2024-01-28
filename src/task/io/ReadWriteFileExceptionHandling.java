package task.io;


import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileExceptionHandling {
    public static void main(String[] args) {
        dividesNumbers(4, 2);
        BankAccount bankAccount = new BankAccount(600);
        bankAccount.withdrawalMoney(500);
        System.out.println(stringConversion("1"));
        List<ListStudent> studentList = new ArrayList<>();
        ListStudent listStudent = new ListStudent("Павел", 19);
        listStudent.addListStudent(listStudent);
        System.out.println(listStudent);
        // listStudent.addListStudent(listStudent);
        Car car = new Car("Lexus");
        car.startingEngine();
        //car.startingEngine();
    }

    // Реализуйте функциональность согласно описанию
    // TODO:Напишите программу, которая создает новый файл и записывает в него данные, которые передаются
    //  строкой
    // TODO: Напишите программу, в которой при запуске приложения вы вводите в консоль текст и на основе
    //  введенного текста создается файл
    // EnterText.java

    // TODO: Cоздайте метод, который делит два числа и возвращает результат. Обработайте исключение,
    //    //  если второе число равно нулю
    public static int dividesNumbers(int number1, int number2) {
        try {
            if (number2 == 0) {
                throw new RuntimeException("На ноль делить нельзя");
            }
            return number1 / number2;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // TODO: Напишите программу, которая считывает число с клавиатуры и выводит его квадрат. Обработайте
    //  исключение, если введено не число

    // TODO: Создайте класс, который представляет банковский счет. Реализуйте метод для снятия денег со
    //  счета. Обработайте исключение, если на счете недостаточно средств.

    // TODO: Напишите программу, которая считывает данные из файла и выводит их на экран. Обработайте
    //  исключение, если файл не найден.

    // TODO: Создайте метод, который преобразует строку в число. Обработайте исключение, если строка не
    //  может быть преобразована в число.
    public static int stringConversion(String str) {
        try {
            int result = Integer.parseInt(str);
            System.out.println("Строка преобразвана");
            return result;
        } catch (Exception ex) {
            throw new RuntimeException("Строка не преобразована:" + str);
        }
    }
    // TODO: Реализуйте класс, который представляет список студентов. Реализуйте метод для добавления
    //  студента в список. Обработайте исключение, если список уже содержит студента с таким же именем.

    // TODO: Напишите программу, которая делит одно число на другое и выводит результат. Обработайте
    //  исключение, если введены некорректные данные (например, вместо числа введена строка).

    // TODO: Создайте класс, который представляет автомобиль. Реализуйте метод для запуска двигателя.
    //  Обработайте исключение, если двигатель уже запущен.

    // TODO: Напишите программу, которая создает файл из текста, который подается строкой, а потом
    //  считывает первое слово из файла
}