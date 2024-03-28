package app;

public class TemperatureObserver extends Observer {

    public TemperatureObserver(Substance substance) {
        this.substance = substance;
        this.substance.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Temperature is: " +substance.getTemperature());
    }
}
