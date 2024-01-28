package task.io;
// TODO: Создайте класс, который представляет автомобиль. Реализуйте метод для запуска двигателя.
//  Обработайте исключение, если двигатель уже запущен.


public class Car {
    public static void main(String[] args)throws Exception{
        Car car =new Car("Lexus");
        car.startingEngin();
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

    public void startingEngin(){
    try{
        if(startingEngine){
            throw new Exception();
        }
        startingEngine=true;
        System.out.println("Starting Engine!");
    } catch (Exception e) {
        System.out.println("Двигатель работает");
    }


    }
}
