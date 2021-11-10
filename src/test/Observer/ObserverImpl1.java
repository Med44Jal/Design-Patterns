package test.Observer;

public class ObserverImpl1 extends Observer {
    @Override
    public void update(Observable observable) {
        int etat = ((ObservableImpl) observable).getEtat();
        System.out.println("Observer#1 state => " + etat);
    }
}
