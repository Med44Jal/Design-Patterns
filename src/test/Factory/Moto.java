package test.Factory;

public abstract class Moto {

    private String model;

    public abstract void afficherDetails();

    public Moto(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
