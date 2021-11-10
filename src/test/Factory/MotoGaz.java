package test.Factory;

public class MotoGaz extends Moto{

    public MotoGaz(String model) {
        super(model);
    }

    @Override
    public void afficherDetails() {
        System.out.println("Moto en gaz");
    }
}
