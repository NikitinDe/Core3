package task.io;
// TODO: Создайте класс, который представляет автомобиль. Реализуйте метод для запуска двигателя.
//  Обработайте исключение, если двигатель уже запущен.


import java.util.Scanner;

public class Car {
    public static void main(String[] args)throws Exception{
        Scanner scanner  =new Scanner(System.in);
        System.out.print("Введите название  автомобиля который хотите запустить: ");
        String avtomobil =scanner.nextLine();
        Car car =new Car(avtomobil);
        car.startingEngin(avtomobil);

    }

private boolean startingEngine;

public Car(String name){
    this.startingEngine = false;
}
    public boolean isStartingEngine() {
        return startingEngine;
    }

    public void setStartingEngine(boolean startingEngine) {
        this.startingEngine = startingEngine;
    }

    public void startingEngin(String avtomobil){
    try{
        if(startingEngine){
            throw new Exception();
        }
        startingEngine=true;
        System.out.println("Запущен двигатель у автомобиля: "+ avtomobil);
    } catch (Exception e) {
        System.out.println(" У данного авто: " + avtomobil+" Двигатель работает! ");
    }


    }
}
