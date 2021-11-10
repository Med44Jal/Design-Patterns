package test.Factory;

public class VehiculeGazFactory extends AbstractFactory {



    @Override
    public Moto creerMoto() {
        return new MotoGaz("Kawazaki");
    }

}
