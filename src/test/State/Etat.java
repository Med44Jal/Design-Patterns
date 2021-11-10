package test.State;

public abstract class Etat {
    protected Commande commande;

    public Etat(Commande commande) {
        this.commande = commande;
    }

    public abstract void ajouterProduit();
    public abstract void retirerProduit();
    public abstract void effacer();
    public abstract void etatSuivant();
}
