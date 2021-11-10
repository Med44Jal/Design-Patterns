package test.State;

public class EtatLivré extends Etat {

    public EtatLivré(Commande commande) {
        super(commande);
    }

    @Override
    public void ajouterProduit() {

    }

    @Override
    public void retirerProduit() {

    }

    @Override
    public void effacer() {
        System.out.println("EtatLivré");
    }

    @Override
    public void etatSuivant() {
        System.out.println("You reach final state.");
    }
}