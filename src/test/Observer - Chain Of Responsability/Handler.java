package test.Tp;

public abstract class Handler {
    public abstract void traiterDemande(Demande demande);
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
