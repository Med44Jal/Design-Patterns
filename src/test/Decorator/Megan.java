package test.Decorator;

public class Megan extends Voiture {

    public Megan() {
        this.description = "megan";
    }

    @Override
    public double cout() {
        return 200000;
    }
}
