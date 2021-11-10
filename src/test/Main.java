package test;

import test.Observer.ObservableImpl;
import test.Observer.Observer;
import test.Observer.ObserverImpl1;
import test.Observer.ObserverImpl2;

public class Main {
    public static void main(String[] args) {
        /*SingletonFactory singletonFactory = SingletonFactory.getInstance();
        System.out.println(singletonFactory.getValue());*/

        /*AbstractFactory moto = new VehiculeGazFactory();
        AbstractFactory moto_ = new VehiculePetrolFactory();

        Moto moto1 = moto.creerMoto();
        System.out.print(moto1.getModel() + "=>");
        moto1.afficherDetails();

        Moto moto2 = moto_.creerMoto();
        System.out.print(moto2.getModel() + "=>");
        moto2.afficherDetails();*/

        /*Commande c = new Commande();
        c.effacer();
        c.etatSuivant();
        c.effacer();
        c.etatSuivant();
        c.effacer();*/

        /*Voiture voiture = new Megan();
        System.out.println(voiture.getDescription() + " " + voiture.cout());
        voiture = new Clima(voiture);
        System.out.println(voiture.getDescription() + " " + voiture.cout());*/

        /*User user = new User.UserBuilder("Mehdi","jalil").address("Agadir").phone("0640164015").build();

        System.out.println(user);*/

        /*Document document = new DocumentPDF();
        document.setContent("This is a document PDF.");
        document.show();*/

        /*Book b = new Book("Titanic", "Mama");
        Magazine m = new Magazine("Baba","caramelo");
        Ressource ressource1 = new BookRessource(b);
        Ressource ressource2 = new MagazineRessource(m);
        View view1 = new BookView(ressource1);
        View view2 = new MagazineView(ressource2);
        System.out.println(view1.show());
        System.out.println(view2.show());*/

        ObservableImpl observable = new ObservableImpl();
        Observer o1 = new ObserverImpl1();
        Observer o2 = new ObserverImpl2();
        o1.update(observable);
        observable.addObserver(o1);
        observable.setEtat(6);
        o2.update(observable);
        o1.update(observable);


    }
}
