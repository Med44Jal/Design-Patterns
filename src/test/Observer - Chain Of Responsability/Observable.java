package test.Tp;

public abstract class Observable {
    public abstract void add(Observer observer);
    public abstract void remove(Observer observer);
    public abstract void notif();
}
