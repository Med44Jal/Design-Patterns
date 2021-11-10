package test.State;

public class EtatValidé extends Etat {

    public EtatValidé(Commande commande) {
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
        System.out.println("EtatValidé");
    }

    @Override
    public void etatSuivant() {
        commande.setEtat(new EtatLivré(commande));
    }
}