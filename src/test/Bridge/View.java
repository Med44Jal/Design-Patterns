package test.Bridge;

public abstract class View {
    protected Ressource ressource;

    public View(Ressource ressource) {
        this.ressource = ressource;
    }

    public abstract String show();
}
