package test.singleton;

public class SingletonFactory {

    private String value = "Value of";

    public static SingletonFactory instance;

    public static SingletonFactory getInstance() {
        if(instance == null)
            instance = new SingletonFactory();
        return instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
