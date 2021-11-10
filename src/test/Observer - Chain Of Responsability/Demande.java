package test.Tp;

import java.util.ArrayList;
import java.util.List;

public class Demande extends Observable {
    private double amount = 4000;
    private String state = "Waiting.";
    private List<Observer> observers = new ArrayList<>();

    public double getAmount() {
        return amount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        this.notif();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notif() {
        for (Observer o : observers) {
            o.refresh(this);
        }
    }
}
