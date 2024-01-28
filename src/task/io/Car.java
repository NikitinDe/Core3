package task.io;

public class Car {
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

    public void startingEngine(){
    try{
        if(startingEngine){
            throw new Exception("Engine to reading!");
        }
        startingEngine=true;
        System.out.println("Starting Engine!");
    } catch (Exception e) {
        throw new RuntimeException(e);
    }


    }
}
