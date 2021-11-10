package test.Decorator;

public class Clima extends DecoratorAbstract{

    public Clima(Voiture voiture) {
        super(voiture);
    }

    @Override
    public double cout() {
        return voiture.cout() + 4000;
    }

    @Override
    public String getDescription() {
        return voiture.getDescription() + " avec climat ";
    }
}
