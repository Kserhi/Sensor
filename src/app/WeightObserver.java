package app;

public class WeightObserver extends Observer {

    public WeightObserver(Substance substance) {
        this.substance = substance;
        this.substance.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Weight is : "+ substance.getWeight());
    }
}
