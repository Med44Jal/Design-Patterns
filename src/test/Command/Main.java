package Command;

public class Main {
    public static void main(String[] args) {
        Remote remote = new Remote();
        Light light = new Light();
        LightOn lightOn = new LightOn(light);
        remote.setCommand(lightOn);
        remote.buttonPressed();
        remote.buttonUndo();
    }
}
