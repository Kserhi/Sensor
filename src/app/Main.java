package app;

public class Main {
    public static void main(String[] args) {
        Substance substance =new Substance();

        new TemperatureObserver(substance);
        new ColorObserver(substance);
        new WeightObserver(substance);


        System.out.println("First change temperature");
        substance.setTemperature(-12);
        System.out.println("-------------");
        System.out.println("Second change temperature");
        substance.setTemperature(32);


    }
}
