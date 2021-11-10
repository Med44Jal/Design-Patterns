package test.Factory;

public class VehiculePetrolFactory extends AbstractFactory{

    @Override
    public Moto creerMoto() {
        return new MotoPetrol("MotoGP");
    }

}
