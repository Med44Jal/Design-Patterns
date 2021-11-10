package test.Tp;

public class ServiceC extends Handler{
    @Override
    public void traiterDemande(Demande demande) {
        demande.setState("Approved.");
    }
}
