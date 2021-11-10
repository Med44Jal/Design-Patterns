package test.State;

public class Commande {
    private Etat etat;

    public Commande() {
        this.etat = new EtatEnCours(this);
    }

    public void ajouterProduit() {
        etat.ajouterProduit();
    }

    public void retirerProduit() {
        etat.retirerProduit();
    }

    public void effacer() {
        etat.effacer();
    }

    public void etatSuivant() {
        etat.etatSuivant();
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }
}
