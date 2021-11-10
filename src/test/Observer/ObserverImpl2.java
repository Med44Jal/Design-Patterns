package test.Observer;

public class ObserverImpl2 extends Observer {
    @Override
    public void update(Observable observable) {
        int state = ((ObservableImpl) observable).getEtat();
        System.out.println("Observer#2 state => " + state);
    }
}
