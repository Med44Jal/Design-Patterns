package test.Tp;

public class ServiceP extends Handler{
    @Override
    public void traiterDemande(Demande demande) {
        demande.setState("Purchased.");
    }
}
