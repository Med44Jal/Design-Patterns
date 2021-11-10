package test.State;

public class EtatEnCours extends Etat {


    public EtatEnCours(Commande commande) {
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
        System.out.println("EtatEnCours");
    }

    @Override
    public void etatSuivant() {
        commande.setEtat(new EtatValidé(commande));
    }
}
