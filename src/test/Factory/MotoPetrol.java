package test.Factory;

public class MotoPetrol extends Moto {

    public MotoPetrol(String model) {
        super(model);
    }

    @Override
    public void afficherDetails() {
        System.out.println("Moto en petrol");
    }
}
