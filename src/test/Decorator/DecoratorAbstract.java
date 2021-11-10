package test.Decorator;

public abstract class DecoratorAbstract extends Voiture {

    protected Voiture voiture;

    public DecoratorAbstract(Voiture voiture) {
        this.voiture = voiture;
    }

    public abstract String getDescription();
}