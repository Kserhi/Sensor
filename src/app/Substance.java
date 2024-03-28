package app;

import java.util.ArrayList;
import java.util.List;

public class Substance {

    private final List<Observer> observers = new ArrayList<>();
    private int temperature;
    private String color;

    private int weight;
    public int getTemperature() {
        return temperature;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        if (temperature<=0){
            this.color="white";
            this.weight=1;
        }else {
            this.color="black";
            this.weight=temperature*2;
        }
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
